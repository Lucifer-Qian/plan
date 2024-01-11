package com.plan.dream.ds;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @ProjectName: synchronous
 * @Package: com.by.synchronous.config.ds
 * @ClassName: New
 * @author: Rocky Qian
 * @description:
 * @date: 2021/10/27 14:17
 * @version: 1.0
 */
@Configuration
@MapperScan(basePackages = BaseDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "baseSqlSessionFactory")
public class BaseDataSourceConfig {

    /**
     * 精确到  目录，以便跟其他数据源隔离
     */
    static final String PACKAGE = "com.plan.dream.dao";
    static final String MAPPER_LOCATION = "classpath:mappers/*.xml";


    @Bean(name = "baseDataSource")
    @ConfigurationProperties(prefix = "datasource.master")
    public DataSource baseDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "transactionManagerBase")
    public DataSourceTransactionManager baseTransactionManager() {
        return new DataSourceTransactionManager(baseDataSource());
    }

    @Bean(name = "baseSqlSessionFactory")
    public SqlSessionFactory baseSqlSessionFactory(@Qualifier("baseDataSource") DataSource baseDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(baseDataSource);
        //防止mybatis返回类型为map时，过滤掉null值得问题,开始
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setCallSettersOnNulls(true);
        sessionFactory.setConfiguration(configuration);
        //结束
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(BaseDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("/druid/base/*");
        reg.addInitParameter("loginUsername", "base");
        reg.addInitParameter("loginPassword", "123456");
        return reg;
    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.addInitParameter("profileEnable", "true");
        filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
        filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
        return filterRegistrationBean;
    }
}

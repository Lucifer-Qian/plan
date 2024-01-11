package com.plan.dream.pattern.chain.demo2;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo3
 * @ClassName: Clent
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/28 14:04
 * @version: 1.0
 */
public class Client {

  private final static Logger logger =  LoggerFactory.getLogger(Client.class);

/*    public static void main(String[] args) throws ParseException {

        AuthLink authLink = new Level3AuthLink("1000013", "李工")
                .appendNext(new Level2AuthLink("1000012", "王经理")
                        .appendNext(new Level1AuthLink("1000011", "罗总")));

        Date current = AuthLink.simpleDateFormat.parse("2022-11-18 23:49:46");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("1000013", "10032321312412", current)));
        AuthService.auth("1000013","10032321312412");
        logger.info("测试结果：{}", "模拟三级负责人审批，李工");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("1000013", "10032321312412", current)));

        AuthService.auth("1000012","10032321312412");
        logger.info("测试结果：{}", "模拟三级负责人审批，王经理");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("1000012", "10032321312412", current)));


        AuthService.auth("1000011","10032321312412");
        logger.info("测试结果：{}", "模拟三级负责人审批，罗总");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("1000011", "10032321312412", current)));
    }*/
}

package com.plan.dream.pattern.proxy.dao.demo2;

import com.plan.dream.pattern.proxy.dao.demo1.MemberDao;
import com.plan.dream.pattern.proxy.dao.demo1.impl.MemberDaoImpl;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.dao.demo2
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/30 14:55
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //获取真是类
        final MemberDaoImpl memberDaoImpl = new MemberDaoImpl();
        //使用代理类工厂、创建代理类
        final MemberDao proxy = (MemberDao)new ProxyFactory(memberDaoImpl).getProxyInstance();

        System.out.println(proxy.getClass());
        // 执行代理方法
        proxy.insert();

        while (true){

        }

    }
}




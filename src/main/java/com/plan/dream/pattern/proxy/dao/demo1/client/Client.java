package com.plan.dream.pattern.proxy.dao.demo1.client;

import com.plan.dream.pattern.proxy.dao.demo1.impl.MemberDaoImpl;
import com.plan.dream.pattern.proxy.dao.demo1.proxy.MemberDaoProxy;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.dao.demo1.client
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/30 14:26
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        final MemberDaoImpl memberDao = new MemberDaoImpl();

        //代理对象
        final MemberDaoProxy memberDaoProxy = new MemberDaoProxy(memberDao);
        //执行代理方法
        memberDaoProxy.insert();
    }
}

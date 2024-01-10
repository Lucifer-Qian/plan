package com.plan.dream.pattern.proxy.service;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.service
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 11:06
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //创建目标类
        final MemberServiceImpl memberService = new MemberServiceImpl();
        System.out.println(memberService.getClass());
        //获取代理方法
        final MemberTransactionProxy memberTransactionProxy = new MemberTransactionProxy();
        //获取代理类
        MemberServiceImpl impl = (MemberServiceImpl) memberTransactionProxy.getTransactionProxy(memberService);
        System.out.println(impl.getClass());
        //代理类增强方法
        impl.getMemberList();
    }
}

package com.plan.dream.pattern.proxy.service;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.service
 * @ClassName: MemberTransactionProxy
 * @author: Rocky Qian
 * @description: 事务代理
 * @date: 2023/10/31 10:50
 * @version: 1.0
 */
public class MemberTransactionProxy implements MethodInterceptor {

    /**
     * 生成CGLIB动态代理方法
     *
     * @param target 需要被代理的目标类
     * @return java.lang.Object 代理类对象
     * @throws
     * @method getTransactionProxy
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/31 10:56
     */
    public Object getTransactionProxy(Object target) {
        //增强类，用来创建动态代理类
        final Enhancer enhancer = new Enhancer();
        //设置代理类的父类字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建动态代理对象，并返回
        return enhancer.create();

    }


    /**
     * 实现回调方法
     *
     * @param o 代理对象
     * @param method 目标对象中的方法实例
     * @param objects 参数列表
     * @param methodProxy 代理对象中的方法的实例
     * @return java.lang.Object
     * @throws Throwable
     * @method intercept
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/31 11:03
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("开启事务");
        //执行代理方法
        final Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("关闭事务");
        return o1;
    }
}

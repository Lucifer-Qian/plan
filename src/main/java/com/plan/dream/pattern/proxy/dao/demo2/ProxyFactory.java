package com.plan.dream.pattern.proxy.dao.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.dao.demo2
 * @ClassName: ProxyFactory
 * @author: Rocky Qian
 * @description: 代理工厂
 * @date: 2023/10/30 14:49
 * @version: 1.0
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取代理类
     *
     * @param
     * @return java.lang.Object
     * @throws
     * @method getProxyInstance
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/30 14:58
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                //目标类使用的类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的接口类型，
                target.getClass().getInterfaces(),
                //创建一个事件处理器
                new InvocationHandler() {
                    /**
                     * invoke
                     *
                     * @param proxy  代理对象
                     * @param method 对应于代理对象上调用的接口的实例
                     * @param args 对应了处理对象在调用接口方法是传递的实际参数
                     * @return java.lang.Object 返回目标对象方法的返回值，没有返回值就返回null
                     * @throws
                     * @method invoke
                     * @author Rocky Qian
                     * @version 1.0
                     * @date 2023/10/30 14:53
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //增强
                        System.out.println("开启事务");
                        method.invoke(target, args);
                        System.out.println("关闭事务");
                        return null;
                    }
                }
        );
    }
}

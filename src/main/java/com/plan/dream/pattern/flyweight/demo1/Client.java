package com.plan.dream.pattern.flyweight.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo1
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/3 16:46
 * @version: 1.0
 */
public class Client {

/*    public static void main(String[] args) {
        //先获取工厂对象
        final FlyweightFactory flyweightFactory = new FlyweightFactory();
        //通过工厂对象获取共享的享元对象
        final Flyweight a1 = flyweightFactory.getFlyweight("F");
        a1.operation("a1");
        final Flyweight a2 = flyweightFactory.getFlyweight("F");
        a2.operation("a2");
        System.out.println(a1 == a2);
        //非共享享元对象，就是普通对象，直接用就可以了
        final UnSharedFlyweight u1 = new UnSharedFlyweight("A");
        final UnSharedFlyweight u2 = new UnSharedFlyweight("A");
        System.out.println(u1 == u2);
    }*/
}

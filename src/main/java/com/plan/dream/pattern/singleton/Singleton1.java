package com.plan.dream.pattern.singleton;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: Singleton1
 * @author: Rocky Qian
 * @description: 饿汉式
 * @date: 2023/10/25 14:34
 * @version: 1.0
 */
public class Singleton1 {

    private static Singleton1 SINGLETON_1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return SINGLETON_1;
    }
}

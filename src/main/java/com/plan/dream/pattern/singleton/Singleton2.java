package com.plan.dream.pattern.singleton;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: Singleton2
 * @author: Rocky Qian
 * @description: 懒汉式
 * @date: 2023/10/25 14:34
 * @version: 1.0
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        singleton2 = new Singleton2();
        return singleton2;
    }
}

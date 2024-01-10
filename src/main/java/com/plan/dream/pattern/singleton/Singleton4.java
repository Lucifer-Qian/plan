package com.plan.dream.pattern.singleton;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: Singleton4
 * @author: Rocky Qian
 * @description: 懒汉式线程安全
 * @date: 2023/10/25 14:39
 * @version: 1.0
 */
public class Singleton4 {

    private static Singleton4 singleton4;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (singleton4 != null) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}

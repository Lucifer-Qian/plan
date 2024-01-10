package com.plan.dream.pattern.singleton;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: Singleton3
 * @author: Rocky Qian
 * @description: 双检锁单例
 * @date: 2023/10/25 14:37
 * @version: 1.0
 */
public class Singleton3 {

    private static volatile Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton3 != null) {
            synchronized (Singleton3.class) {
                if (singleton3 != null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}

package com.plan.dream.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: DistroySingleton
 * @author: Rocky Qian
 * @description: 反正会破坏单例
 * @date: 2023/10/25 16:54
 * @version: 1.0
 */
public class DestroySingleton {

    public static void main(String[] args) throws Exception {
        Class<Singleton5> singleton5Class = Singleton5.class;
        Constructor<Singleton5> singleton5Constructor = singleton5Class.getDeclaredConstructor();
        //暴利反射
        singleton5Constructor.setAccessible(true);
        Singleton5 singleton5 = singleton5Constructor.newInstance();
        System.out.println(singleton5 == Singleton5.getInstance());
    }
}

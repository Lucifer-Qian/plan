package com.plan.dream.pattern.singleton;

import java.io.Serializable;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: Singleton5
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/25 14:39
 * @version: 1.0
 */
public class Singleton5 implements Serializable {

    private Singleton5() {
        if (Singleton05Handler.singleton5 != null){
            throw new RuntimeException("不允许反射");
        }
    }

    private static class Singleton05Handler {
        private static Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Singleton05Handler.singleton5;
    }

    private Object readResolve(){
       return  Singleton05Handler.singleton5;
    }
}

package com.plan.dream.pattern.singleton;

import java.io.*;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: SerializableSingleton
 * @author: Rocky Qian
 * @description: 序列化与反序列化
 * @date: 2023/10/25 17:05
 * @version: 1.0
 */
public class SerializableSingleton {

    public static void main(String[] args) throws Exception {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp.obj"));
        objectOutputStream.writeObject(Singleton5.getInstance());

        File file = new File("temp.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Singleton5 singleton5 = (Singleton5) objectInputStream.readObject();

        System.out.println(singleton5 == Singleton5.getInstance());
    }
}

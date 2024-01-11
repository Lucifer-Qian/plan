package com.plan.dream.pattern.prototype.deep;

import java.io.*;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.prototype.deep
 * @ClassName: Test1ConcretePrototype
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 19:26
 * @version: 1.0
 */
public class Test1ConcretePrototype {
/*    public static void main(String[] args) throws Exception {
        ConcretePrototype c1 = new ConcretePrototype();
        Student s1 = new Student(1, "小明");
        c1.setStudent(s1);

        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(c1);
        oos.close();
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ConcretePrototype c2 = (ConcretePrototype) ois.readObject();
        ois.close();
        Student s2 = c2.getStudent();

        s2.setAge(2);
        s2.setName("小刚");

        c1.getStudentInfo();
        c2.getStudentInfo();
        System.out.println(s1 == s2);
    }*/
}

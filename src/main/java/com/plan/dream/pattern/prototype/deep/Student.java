package com.plan.dream.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.prototype.deep
 * @ClassName: Student
 * @author: Rocky Qian
 * @description: 引用类型
 * @date: 2023/10/27 18:26
 * @version: 1.0
 */
public class Student implements Serializable {

    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

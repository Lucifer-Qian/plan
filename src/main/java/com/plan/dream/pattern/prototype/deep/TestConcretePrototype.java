package com.plan.dream.pattern.prototype.deep;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.prototype.shallow
 * @ClassName: TestConcretePrototype
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 18:17
 * @version: 1.0
 */
public class TestConcretePrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        //new 一个原型类
        ConcretePrototype c1 = new ConcretePrototype();
        //new 一个引用类
        Student s1 = new Student(1, "小明");
        //set 引用成员变量
        c1.setStudent(s1);
        //浅克隆
        ConcretePrototype c2 = c1.clone();
        //获取到浅克隆后的引用类
        Student s2 = c2.getStudent();
        //并把引用类赋值
        s2.setAge(2);
        s2.setName("小刚");
        //分别把原型类和浅克隆后的类信息打印
        c1.getStudentInfo();
        c2.getStudentInfo();
        //比较两个类中引用成员变量
        System.out.println(s1 == s2);
    }

}

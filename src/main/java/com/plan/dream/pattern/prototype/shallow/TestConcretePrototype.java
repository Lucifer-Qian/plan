package com.plan.dream.pattern.prototype.shallow;

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
        //创建一个新对象
        final ConcretePrototype c1 = new ConcretePrototype();
        //新对象clone出另外一个对象
        final ConcretePrototype c2 = c1.clone();
        //查看两个对象的地址值是否一致
        System.out.println(c1 == c2);
    }
}

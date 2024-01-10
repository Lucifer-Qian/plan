package com.plan.dream.pattern.flyweight.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo1
 * @ClassName: ConcreteFlyweight
 * @author: Rocky Qian
 * @description: 在具体的享元类中，需要将内部状态和外部状态分开处理
 * @date: 2023/11/3 15:11
 * @version: 1.0
 */
public class ConcreteFlyweight extends Flyweight {

    /**
     * 内部状态：inState作为一个成员变量，同一个享元对象的内部状态是一致的。
     */
    private final String inState;


    public ConcreteFlyweight(String inState) {
        this.inState = inState;
    }

    /**
     * 外部状态在使用的时候，通常是有外部设置，不保存在享元对象中，即使是同一个对象
     *
     * @param state
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 15:14
     */
    @Override
    public void operation(String state) {
        System.out.println("内部状态： " + inState + "   外部状态：" + state);

    }
}

package com.plan.dream.pattern.prototype.shallow;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.prototype
 * @ClassName: PrototypeClass
 * @author: Rocky Qian
 * @description: 原型类
 * @date: 2023/10/27 18:01
 * @version: 1.0
 */
public class ConcretePrototype implements Cloneable {

    public ConcretePrototype(){
        System.out.println("具体的原型对象创建成功了");
    }

    /**
     * clone 众所周知，object的clone方法是浅克隆，我们现在直接用就好了
     *
     * @param
     * @return com.plan.dream.pattern.prototype.shallow.ConcretePrototype
     * @throws
     * @method clone
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 18:21
     */
    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功");
        return (ConcretePrototype) super.clone();
    }
}

package com.plan.dream.pattern.flyweight.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight
 * @ClassName: Flyweight
 * @author: Rocky Qian
 * @description: 抽象享元类
 * @date: 2023/11/3 14:42
 * @version: 1.0
 */
public abstract class Flyweight {

    /**
     * 可共享的
     *
     * @param state
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 15:07
     */
    public abstract void operation(String state);

}

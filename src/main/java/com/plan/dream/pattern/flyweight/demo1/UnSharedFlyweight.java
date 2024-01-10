package com.plan.dream.pattern.flyweight.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo1
 * @ClassName: UnSharedFlyweight
 * @author: Rocky Qian
 * @description: 非共享的享元类
 * @date: 2023/11/3 15:16
 * @version: 1.0
 */
public class UnSharedFlyweight extends Flyweight {

    private String inState;

    public UnSharedFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("使用不共享对象，内部状态：" + inState + "  外部状态：" + state);
    }
}

package com.plan.dream.pattern.state.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo1
 * @ClassName: ConcreteState1
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:03
 * @version: 1.0
 */
public class ConcreteState1 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("进入到状态模式1...........");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态：ConcreteState1{}";
    }
}

package com.plan.dream.pattern.state.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo1
 * @ClassName: ConcreteState2
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:03
 * @version: 1.0
 */
public class ConcreteState2 implements DemoState {
    @Override
    public void handle(Context context) {
        System.out.println("进入到状态模式2...........");
        context.setCurrentDemoState(this);
    }

    @Override
    public String toString() {
        return "当前状态：ConcreteState2{}";
    }
}

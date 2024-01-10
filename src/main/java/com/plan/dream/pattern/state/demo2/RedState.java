package com.plan.dream.pattern.state.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo2
 * @ClassName: RedState
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:40
 * @version: 1.0
 */
public class RedState implements State{
    @Override
    public void switchToGreen(TrafficLight light) {
        System.out.println("红灯切换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight light) {
        System.out.println("红灯不能切换为黄灯");
    }

    @Override
    public void switchToRed(TrafficLight light) {
        System.out.println("当前就是红灯");
    }
}

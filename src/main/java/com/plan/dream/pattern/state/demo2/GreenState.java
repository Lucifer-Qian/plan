package com.plan.dream.pattern.state.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo2
 * @ClassName: GreenState
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:40
 * @version: 1.0
 */
public class GreenState implements State {
    @Override
    public void switchToGreen(TrafficLight light) {
        System.out.println("当前就是绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight light) {
        System.out.println("黄灯亮起...时长：10s");
    }

    @Override
    public void switchToRed(TrafficLight light) {
        System.out.println("绿灯不能切换成红灯");
    }
}

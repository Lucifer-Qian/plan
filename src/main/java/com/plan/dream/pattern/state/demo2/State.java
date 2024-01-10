package com.plan.dream.pattern.state.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo2
 * @ClassName: State
 * @author: Rocky Qian
 * @description: 交通灯状态接口
 * @date: 2023/11/29 17:25
 * @version: 1.0
 */
public interface State {

    /**
     * 切换为绿灯
     */
    void switchToGreen(TrafficLight light);

    /**
     * 切换为黄灯
     */
    void switchToYellow(TrafficLight light);

    /**
     * 切换为红灯
     */
    void switchToRed(TrafficLight light);
}

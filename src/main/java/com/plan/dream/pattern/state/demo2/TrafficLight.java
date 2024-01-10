package com.plan.dream.pattern.state.demo2;

import lombok.Data;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo2
 * @ClassName: TrafficLight
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:45
 * @version: 1.0
 */
@Data
public class TrafficLight {
    State state = new RedState();


    public void switchGreen() {
        state.switchToGreen(this);
    }

    public void switchRed() {
        state.switchToRed(this);
    }

    public void switchYellow() {
        state.switchToYellow(this);
    }
}

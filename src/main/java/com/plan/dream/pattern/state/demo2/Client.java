package com.plan.dream.pattern.state.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.state.demo2
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/29 17:48
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.switchRed();
        trafficLight.switchGreen();
        trafficLight.switchYellow();

    }
}

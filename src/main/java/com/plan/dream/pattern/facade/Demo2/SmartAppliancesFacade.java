package com.plan.dream.pattern.facade.Demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.dacade.Demo2
 * @ClassName: SmartApplitationFacade
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 15:32
 * @version: 1.0
 */
public class SmartAppliancesFacade {


    private Light light;
    private Tv tv;
    private AirCondition airCondition;


    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new Tv();
        this.airCondition = new AirCondition();
    }

    /**
     * 只能语音
     *
     * @param msg
     * @return void
     * @throws
     * @method say
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 15:39
     */
    public void say(String msg) {

        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("请重说");
        }

    }

    /**
     * 打开所有家电
     *
     * @param
     * @return void
     * @throws
     * @method on
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 15:39
     */
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    /**
     * 关闭所有家电
     *
     * @param
     * @return void
     * @throws
     * @method off
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 15:39
     */
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }




}

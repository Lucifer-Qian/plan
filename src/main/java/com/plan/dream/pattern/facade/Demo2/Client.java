package com.plan.dream.pattern.facade.Demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.dacade.Demo2
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 15:38
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        final SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();

        smartAppliancesFacade.say("打开家电");

        smartAppliancesFacade.say("关闭家电");

    }
}

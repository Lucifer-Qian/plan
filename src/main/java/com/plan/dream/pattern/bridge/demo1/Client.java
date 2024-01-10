package com.plan.dream.pattern.bridge.demo1;

import java.math.BigDecimal;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo1
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 16:18
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("使用微信密码支付");
        PayController.doPay("wx_001","111",new BigDecimal(100),1,1);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("使用支付宝人脸支付");
        PayController.doPay("wx_001","111",new BigDecimal(100),1,2);
    }
}

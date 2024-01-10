package com.plan.dream.pattern.bridge.demo1;

import java.math.BigDecimal;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo1
 * @ClassName: Pay
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 16:12
 * @version: 1.0
 */
public class PayController {

    /**
     * 支付功能
     *
     * @param uid         用户id
     * @param tradeId     商户id
     * @param amount      交易金额
     * @param channelType 渠道类型 1 微信 2 支付宝
     * @param modeType    支付方式  1 密码 2 人脸 3 指纹
     * @return boolean
     * @throws
     * @method doPay
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/31 16:14
     */
    public static boolean doPay(String uid, String tradeId, BigDecimal amount, int channelType, int modeType) {

        //微信支付
        if (channelType == 1) {
            System.out.println("微信支付渠道开始。。。。。。。。。。");
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }

        }
        if (channelType == 2) {
            //支付宝支付
            System.out.println("支付宝支付渠道开始。。。。。。。。。。");
            if (modeType == 1) {
                System.out.println("密码支付");
            } else if (modeType == 2) {
                System.out.println("人脸支付");
            } else if (modeType == 3) {
                System.out.println("指纹支付");
            }
        }
        System.out.println("支付完成");
        return true;

    }
}

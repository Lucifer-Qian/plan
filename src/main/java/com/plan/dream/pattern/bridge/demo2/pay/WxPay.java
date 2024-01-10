package com.plan.dream.pattern.bridge.demo2.pay;


import com.plan.dream.pattern.bridge.demo2.pay_mode.PayMode;

import java.math.BigDecimal;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo2
 * @ClassName: WxPay
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 16:54
 * @version: 1.0
 */
public class WxPay extends Pay {

    public WxPay(PayMode payMode) {
        super(payMode);
    }

    /**
     * 微信支付
     *
     * @param uid     用户id
     * @param tradeId 商户id
     * @param amount  金额
     * @return java.lang.String
     * @throws
     * @method transfer
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 13:42
     */
    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        System.out.println("微信支付开始");

        if (payMode.security(uid)) {
            System.out.println("微信支付成功");
            return "200";
        } else {
            System.out.println("微信支付失败");
        }
        return "500";
    }
}

package com.plan.dream.pattern.bridge.demo2.pay;

import com.plan.dream.pattern.bridge.demo2.pay_mode.PayMode;

import java.math.BigDecimal;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo2
 * @ClassName: Service
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 16:54
 * @version: 1.0
 */
public abstract class Pay {

    /**
     * 桥接对象
     */
    protected PayMode payMode;

    public Pay (PayMode payMode){
        this.payMode = payMode;
    }


    /**
     * 支付
     *
     * @param uid 用户id
     * @param tradeId 商户id
     * @param amount 金额
     * @return java.lang.String
     * @throws
     * @method transfer
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 13:41
     */
    public abstract String transfer(String uid, String tradeId, BigDecimal amount);

}

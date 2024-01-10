package com.plan.dream.pattern.bridge.demo2.pay_mode;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo2
 * @ClassName: PayMode
 * @author: Rocky Qian
 * @description: 支付模式 接口
 * @date: 2023/10/31 16:54
 * @version: 1.0
 */
public interface PayMode  {

    /**
     * 对支付模式风控
     *
     * @param uid
     * @return boolean
     * @throws
     * @method security
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 10:59
     */
     boolean security(String uid);
}

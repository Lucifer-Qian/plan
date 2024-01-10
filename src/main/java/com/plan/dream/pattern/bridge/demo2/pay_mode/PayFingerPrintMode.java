package com.plan.dream.pattern.bridge.demo2.pay_mode;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.bridge.demo2
 * @ClassName: PayFingerPrintMode
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 16:55
 * @version: 1.0
 */
public class PayFingerPrintMode implements PayMode {

    /**
     * 指纹支付
     *
     * @param uid
     * @return boolean
     * @throws
     * @method security
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 11:04
     */
    @Override
    public boolean security(String uid) {
        System.out.println("指纹风控通过");
        return true;
    }
}

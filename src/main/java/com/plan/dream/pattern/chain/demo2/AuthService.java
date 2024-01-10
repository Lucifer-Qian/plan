package com.plan.dream.pattern.chain.demo2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo2
 * @ClassName: AuthService
 * @author: Rocky Qian
 * @description: 模拟审核服务
 * @date: 2023/11/27 17:16
 * @version: 1.0
 */
public class AuthService {

    //审核信息容器  key : 审批人id + 审批单id，value ： 审批时间
    private static Map<String, Date> authMap = new HashMap<>();


    /**
     * 审批方法
     *
     * @param uid     审核人id
     * @param orderId 审核单id
     * @return void
     * @throws
     * @method auth
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/28 9:14
     */
    public static void auth(String uid, String orderId) {
        System.out.println("进入审核流程，审批人ID:" + uid);
        authMap.put(uid.concat(orderId), new Date());
    }

    /**
     * 查询审核结果
     *
     * @param uid     审核人id
     * @param orderId 审核单id
     * @throws
     * @method queryAuthInfo
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/28 9:16
     */
    public static Date queryAuthInfo(String uid, String orderId) {
        return authMap.get(uid.concat(orderId));
    }

}

package com.plan.dream.pattern.chain.demo2;

import java.text.ParseException;
import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo3
 * @ClassName: Leve31AuthLink
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/28 10:22
 * @version: 1.0
 */
public class Level3AuthLink extends AuthLink{


    public Level3AuthLink(String levelUserId, String levelName) throws ParseException {
        super(levelUserId, levelName);
    }

    @Override
    public AuthInfo doAuth(String uid, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("0001", "单号：" + orderId, "待三级审批人员审批", levelName);
        }
        AuthLink next = super.getNext();
        if (next == null) {
            return new AuthInfo("0001", "单号：" + orderId, "三级审批完成", levelName);
        }

        return next.doAuth(uid, orderId, authDate);
    }
}

package com.plan.dream.pattern.chain.demo2;

import java.text.ParseException;
import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo3
 * @ClassName: Level1AuthLink
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/28 10:22
 * @version: 1.0
 */
public class Level1AuthLink extends AuthLink {


    public Level1AuthLink(String levelUserId, String levelName) throws ParseException {
        super(levelUserId, levelName);
    }

    /**
     * 审核
     *
     * @param uid
     * @param orderId
     * @param authDate
     * @return com.plan.dream.pattern.chain.demo3.AuthInfo
     * @throws
     * @method doAuth
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/28 13:59
     */
    @Override
    public AuthInfo doAuth(String uid, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (date == null) {
            return new AuthInfo("0001", "单号：" + orderId, "待一级审批人员审批", levelName);
        }
        AuthLink next = super.getNext();
        if (next == null) {
            return new AuthInfo("0001", "单号：" + orderId, "一级审批完成", levelName);
        }
        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0001", "单号：" + orderId, "一级审批完成", levelName);
        }

        return next.doAuth(uid, orderId, authDate);
    }
}

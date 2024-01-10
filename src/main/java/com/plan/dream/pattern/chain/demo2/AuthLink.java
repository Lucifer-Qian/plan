package com.plan.dream.pattern.chain.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo3
 * @ClassName: AuthLink
 * @author: Rocky Qian
 * @description: 审核抽象类
 * @date: 2023/11/28 10:21
 * @version: 1.0
 */
public abstract class AuthLink {

    protected static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected static final Date beginDate;
    protected static final Date endDate;

    static {
        try {
            beginDate = simpleDateFormat.parse("2022-11-11 00:00:00");
            endDate = simpleDateFormat.parse("2022-11-31 00:00:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * levelUserId:审核人id
     * levelName:审核人名称
     * next:表示持有下一个处理对象的引用
     */
    protected String levelUserId;
    protected String levelName;
    protected AuthLink next;

    public AuthLink(String levelUserId, String levelName) throws ParseException {
        this.levelUserId = levelUserId;
        this.levelName = levelName;
    }

    public String getLevelUserId() {
        return levelUserId;
    }

    public void setLevelUserId(String levelUserId) {
        this.levelUserId = levelUserId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }


    public AuthLink getNext() {
        return next;
    }

    /**
     * 向责任链中添加处理器
     *
     * @param next
     * @return com.plan.dream.pattern.chain.demo3.AuthLink
     * @throws
     * @method appendNext
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/28 10:49
     */
    public AuthLink appendNext(AuthLink next){
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uid, String orderId, Date authDate);
}

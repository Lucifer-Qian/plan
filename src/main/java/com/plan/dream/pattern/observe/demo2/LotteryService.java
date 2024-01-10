package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: LottertService
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:34
 * @version: 1.0
 */
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        //设置事件类型
        eventManager = new EventManager(EventTypeEnum.MQ, EventTypeEnum.MESSAGE);
        eventManager.subscribe(EventTypeEnum.MESSAGE, new MsgEventListener());
        eventManager.subscribe(EventTypeEnum.MQ, new MqEventListener());
    }

    /**
     * 发送信息
     *
     * @param uid
     * @return com.plan.dream.pattern.observe.demo2.LotteryResult
     * @throws
     * @method lotteryAndMessage
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:40
     */
    public LotteryResult lotteryAndMessage(String uid) {
        final LotteryResult lottery = lottery(uid);
        //发送
        eventManager.eventNotify(EventTypeEnum.MESSAGE, lottery);
        eventManager.eventNotify(EventTypeEnum.MQ, lottery);
        return lottery;
    }

    /**
     * 中签
     *
     * @param uid
     * @return com.plan.dream.pattern.observe.demo2.LotteryResult
     * @throws
     * @method lottery
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:44
     */
    public abstract LotteryResult lottery(String uid);
}

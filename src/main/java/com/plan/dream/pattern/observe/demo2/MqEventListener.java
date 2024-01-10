package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: MQEventListener
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:22
 * @version: 1.0
 */
public class MqEventListener implements EventListener {

    /**
     * Mq 消息发送
     *
     * @param result
     * @return void
     * @throws
     * @method doEvent
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:22
     */
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("MQ记录摇号的中签结果：用户id" + result.getUid() + "结果：" + result.getMsg());
    }
}

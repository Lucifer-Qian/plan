package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: MsgEventListener
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:19
 * @version: 1.0
 */
public class MsgEventListener implements EventListener {

    /**
     * 发送短信通知
     *
     * @param result
     * @return void
     * @throws
     * @method doEvent
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:19
     */
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知，用户id" + result.getUid() + "您的摇号结果：" + result.getMsg());
    }
}

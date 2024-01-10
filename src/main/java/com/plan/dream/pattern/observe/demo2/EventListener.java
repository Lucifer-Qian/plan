package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: EventListener
 * @author: Rocky Qian
 * @description: 事件处理
 * @date: 2023/11/6 14:17
 * @version: 1.0
 */
public interface EventListener {

    /**
     * 事件处理
     *
     * @param result
     * @return void
     * @throws
     * @method doEvent
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:18
     */
    void doEvent(LotteryResult result);
}

package com.plan.dream.pattern.observe.demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: EventManager
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:23
 * @version: 1.0
 */
public class EventManager {

    /**
     * 监听器的集合
     */
    private Map<Enum<EventTypeEnum>, List<EventListener>> listMap = new HashMap<>();


    public EventManager(Enum<EventTypeEnum>... operation) {
        for (Enum<EventTypeEnum> eventTypeEnumEnum : operation) {
            this.listMap.put(eventTypeEnumEnum, new ArrayList<>());
        }
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     * @param listener  具体监听对象
     * @return void
     * @throws
     * @method subscribe
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:31
     */
    public void subscribe(Enum<EventTypeEnum> eventType, EventListener listener) {
        final List<EventListener> eventListeners = listMap.get(eventType);
        eventListeners.add(listener);
    }


    /**
     * 取消订阅
     *
     * @param eventType 事件类型
     * @param listener  具体监听对象
     * @return void
     * @throws
     * @method subscribe
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:31
     */
    public void unSubscribe(Enum<EventTypeEnum> eventType, EventListener listener) {
        final List<EventListener> eventListeners = listMap.get(eventType);
        eventListeners.remove(listener);
    }

    /**
     * 通知
     *
     * @param eventType 事件类型
     * @param result    具体监听对象
     * @return void
     * @throws
     * @method subscribe
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:31
     */
    public void eventNotify(Enum<EventTypeEnum> eventType, LotteryResult result) {
        final List<EventListener> eventListeners = listMap.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(result);
        }
    }
}

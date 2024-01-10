package com.plan.dream.pattern.observe.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo1
 * @ClassName: Observer
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 10:27
 * @version: 1.0
 */
public interface Observer {

    /**
     * 为不同的观察者更新行为，定义一个相同的接口，不同的观察者对该接口有不同的实现
     *
     * @param
     * @return void
     * @throws
     * @method update
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:40
     */
    void update();
}

package com.plan.dream.pattern.observe.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo1
 * @ClassName: ConcreteObserver2
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 10:43
 * @version: 1.0
 */
public class ConcreteObserver2  implements Observer{


    /**
     * 具体实现
     *
     * @param
     * @return void
     * @throws
     * @method update
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:53
     */
    @Override
    public void update() {
        System.out.println("ConcreteObserver2 等到通知，更新状态！");
    }
}

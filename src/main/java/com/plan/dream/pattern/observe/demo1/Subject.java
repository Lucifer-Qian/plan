package com.plan.dream.pattern.observe.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo1
 * @ClassName: Subject
 * @author: Rocky Qian
 * @description: 抽象目标类
 * @date: 2023/11/6 10:27
 * @version: 1.0
 */
public abstract class Subject {


    /**
     * 绑定
     *
     * @param ob
     * @return void
     * @throws
     * @method attach
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:54
     */
    public abstract void attach(Observer ob);

    /**
     * 通知
     *
     * @return void
     * @throws
     * @method attach
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:54
     */
    public abstract void observerNotify();

    /**
     * 解除绑定
     *
     * @param ob
     * @return void
     * @throws
     * @method attach
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:54
     */
    public abstract void detach(Observer ob);

}

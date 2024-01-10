package com.plan.dream.pattern.observe.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo1
 * @ClassName: ConcreteSubject
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 10:30
 * @version: 1.0
 */
public class ConcreteSubject extends Subject {

    private List<Observer> obsList = new ArrayList<>();

    /**
     * 注册方法 向观察者集合增加一个观察者
     *
     * @param ob
     * @return void
     * @throws
     * @method attach
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:58
     */
    @Override
    public void attach(Observer ob) {
        obsList.add(ob);
    }

    /**
     * 通知
     *
     * @return void
     * @throws
     * @method notify
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:59
     */
    @Override
    public void observerNotify() {
        for (Observer observer : obsList) {
            observer.update();
        }
    }

    /**
     * 解绑
     *
     * @param ob
     * @return void
     * @throws
     * @method detach
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 10:59
     */
    @Override
    public void detach(Observer ob) {
        obsList.remove(ob);
    }
}

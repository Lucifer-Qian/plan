package com.plan.dream.pattern.adapter.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo1
 * @ClassName: Adapter
 * @author: Rocky Qian
 * @description: 适配器类
 * @date: 2023/11/2 11:04
 * @version: 1.0
 */
public class Adapter extends Adaptee implements Target {


    /**
     * 适配器类-适配方法
     *
     * @param
     * @return void
     * @throws
     * @method request
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 11:05
     */
    @Override
    public void request() {
        System.out.println("开始调用类适配器");
        super.adapteeRequest();
        System.out.println("调用类适配器解释");
    }
}

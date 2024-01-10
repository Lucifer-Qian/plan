package com.plan.dream.pattern.adapter.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo1
 * @ClassName: Adaptee
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 11:02
 * @version: 1.0
 */
public class Adaptee {


    /**
     * 被适配的类-被适配的方法
     *
     * @param
     * @return void
     * @throws
     * @method adapteeRequest
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 11:04
     */
    public void adapteeRequest() {
        System.out.println("被适配的方法执行了");
    }

}

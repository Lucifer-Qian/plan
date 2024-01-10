package com.plan.dream.pattern.facade.Demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.dacade.Demo1
 * @ClassName: Facade
 * @author: Rocky Qian
 * @description: 外观类
 * @date: 2023/11/2 15:22
 * @version: 1.0
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    /**
     * 外观类方法
     *
     * @param
     * @return void
     * @throws
     * @method method
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 15:22
     */
    public void method(){
        System.out.println("调用外观类，执行子系统方法");
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
        System.out.println("执行完成");
    }
}

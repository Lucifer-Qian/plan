package com.plan.dream.pattern.template.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.template.demo1
 * @ClassName: Template1
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/7 18:41
 * @version: 1.0
 */
public class ConcreteTemplate1 extends AbstractClassTemplate {

    /**
     * 子类1调用
     *
     * @param
     * @return void
     * @throws
     * @method step3
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 18:42
     */
    @Override
    void step3() {
        System.out.println("在子类1中执行step3");
    }

    /**
     * 子类1调用
     *
     * @param
     * @return void
     * @throws
     * @method step4
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 18:42
     */
    @Override
    void step4() {
        System.out.println("在子类1中执行step4");
    }
}

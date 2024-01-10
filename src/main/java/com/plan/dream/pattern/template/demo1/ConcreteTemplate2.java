package com.plan.dream.pattern.template.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.template.demo1
 * @ClassName: Template2
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/7 18:41
 * @version: 1.0
 */
public class ConcreteTemplate2 extends AbstractClassTemplate {

    /**
     * 子类2调用
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
    void step3() {
        System.out.println("在子类2中执行step3");
    }

    /**
     * 子类2调用
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
        System.out.println("在子类2中执行step4");
    }
}

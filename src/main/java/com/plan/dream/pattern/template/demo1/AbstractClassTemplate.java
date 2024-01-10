package com.plan.dream.pattern.template.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern
 * @ClassName: AbstractClassTemple
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 17:36
 * @version: 1.0
 */
public abstract class AbstractClassTemplate {

    /**
     * 抽象模板方法1
     *
     * @param key
     * @return void
     * @throws
     * @method step1
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 18:39
     */
    void step1(String key) {
        System.out.println("执行步骤1");
        if (step2(key)) {
            step3();
        }else {
            step4();
        }
        step5();
    }

    /**
     * 抽象模板方法2
     *
     * @param key
     * @return java.lang.Boolean
     * @throws
     * @method step2
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 18:39
     */
    Boolean step2(String key) {
        System.out.println("执行步骤2");
        if (key.equals("x")) {
            return true;
        }
        return false;
    }

    /**
     * 子类实现3
     *
     * @param
     * @return void
     * @throws
     * @method step3
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 17:47
     */
    abstract void step3();

    /**
     * 子类实现4
     *
     * @param
     * @return void
     * @throws
     * @method step3
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 17:47
     */
    abstract void step4();

    /**
     * 抽象执行
     *
     * @param
     * @return void
     * @throws
     * @method step5
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 17:48
     */
    void step5() {
        System.out.println("执行步骤5");
    }

}

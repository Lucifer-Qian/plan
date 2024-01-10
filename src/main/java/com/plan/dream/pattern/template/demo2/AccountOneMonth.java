package com.plan.dream.pattern.template.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.template.demo2
 * @ClassName: AccountOneMonth
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/7 19:49
 * @version: 1.0
 */
public class AccountOneMonth extends Account {

    /**
     * 获取利率
     *
     * @param
     * @return int
     * @throws
     * @method calculate
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:49
     */
    @Override
    public int calculate() {
        System.out.println("获取一个月利率");
        return 10;
    }
}

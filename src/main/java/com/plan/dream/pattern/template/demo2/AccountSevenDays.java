package com.plan.dream.pattern.template.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.template.demo2
 * @ClassName: AccountSevenDays
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/7 19:47
 * @version: 1.0
 */
public class AccountSevenDays extends Account {

    /**
     * 获取利率
     *
     * @param
     * @return int
     * @throws
     * @method calculate
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:47
     */
    @Override
    public int calculate() {
        System.out.println("获取七天利率");
        return 1;
    }

    /**
     * 钩子方法
     *
     * @param
     * @return void
     * @throws
     * @method display
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:48
     */
    @Override
    public void display() {
        System.out.println("无额外费用");
    }
}

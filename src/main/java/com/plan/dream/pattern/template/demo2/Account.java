package com.plan.dream.pattern.template.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.template.demo2
 * @ClassName: Account
 * @author: Rocky Qian
 * @description: 账户抽象模板
 * @date: 2023/11/7 19:29
 * @version: 1.0
 */
public abstract class Account {

    /**
     * 验证用户信息
     *
     * @param account
     * @param password
     * @return boolean
     * @throws
     * @method validate
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:39
     */
    public boolean validate(String account, String password) {
        if (account.equals("tom") && password.equals("123456")) {
            return true;
        }
        return false;
    }

    /**
     * 利息计算
     *
     * @param
     * @return int
     * @throws
     * @method calculate
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:44
     */
    public abstract int calculate();

    /**
     * 显示利息
     *
     * @param
     * @return void
     * @throws
     * @method display
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:44
     */
    public void display() {
        System.out.println("显示利息！");
    }


    /**
     * 模板方法
     *
     * @param account
     * @param password
     * @return void
     * @throws
     * @method handler
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/7 19:47
     */
    public void handler(String account, String password) {

        if (validate(account, password)) {
            System.out.println("利率为：" + calculate() + "%");
            display();
            return;
        }
        System.out.println("账号密码错误！");
    }
}

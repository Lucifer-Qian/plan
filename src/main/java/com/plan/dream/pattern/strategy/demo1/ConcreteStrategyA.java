package com.plan.dream.pattern.strategy.demo1;

/**
 * @version 1.0
 * @Author qianmingchao
 * @Date 2023/11/7 22:39
 * @Description:
 */
public class ConcreteStrategyA extends AbstractStrategy{

    /**
     * 具体策略方法
     */
    @Override
    void algorithm() {
        System.out.println("执行A策略方法");
    }
}

package com.plan.dream.pattern.strategy.demo1;

/**
 * @version 1.0
 * @Author qianmingchao
 * @Date 2023/11/7 22:39
 * @Description:
 */
public class Context {

    private AbstractStrategy abstractStrategy;

    /**
     * 构造方法
     * @param abstractStrategy
     */
    public Context(AbstractStrategy abstractStrategy){
        this.abstractStrategy = abstractStrategy;
    }

    /**
     * 调用具体策略方法
     */
    public void algorithm(){
        abstractStrategy.algorithm();
    }

}

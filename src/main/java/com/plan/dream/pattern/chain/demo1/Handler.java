package com.plan.dream.pattern.chain.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo1
 * @ClassName: Handler
 * @author: Rocky Qian
 * @description: 抽象处理这
 * @date: 2023/11/20 15:17
 * @version: 1.0
 */
public abstract class Handler {

    public Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(RequestData requestData);
}

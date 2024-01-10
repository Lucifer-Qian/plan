package com.plan.dream.pattern.strategy.demo3.handle;

import com.plan.dream.pattern.strategy.demo2.Receipt;
import com.plan.dream.pattern.strategy.demo3.ReceiptHandleStrategy;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo3.handle
 * @ClassName: ReceiptStrategyContext
 * @author: Rocky Qian
 * @description: 上下文类。持有策略接口，决定执行哪一个具体的策略类
 * @date: 2023/11/14 10:13
 * @version: 1.0
 */
public class ReceiptStrategyContext {
    private ReceiptHandleStrategy receiptHandleStrategy;

    public void setReceiptHandleStrategy(ReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    //调用策略类中的方法
    public void handle(Receipt receipt){
        if (receipt != null){
            receiptHandleStrategy.handle(receipt);
        }
    }
}

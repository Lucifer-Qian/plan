package com.plan.dream.pattern.strategy.demo3;

import com.plan.dream.pattern.strategy.demo2.Receipt;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo3
 * @ClassName: ReceiptHandleStrategy
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/14 10:07
 * @version: 1.0
 */
public interface ReceiptHandleStrategy {

    void handle(Receipt receipt);
}

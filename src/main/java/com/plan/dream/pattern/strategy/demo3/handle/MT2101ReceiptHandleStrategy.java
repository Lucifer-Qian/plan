package com.plan.dream.pattern.strategy.demo3.handle;

import com.plan.dream.pattern.strategy.demo2.Receipt;
import com.plan.dream.pattern.strategy.demo3.ReceiptHandleStrategy;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo3.handle
 * @ClassName: MT1101ReceiptHandleStrategy
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/14 10:09
 * @version: 1.0
 */
public class MT2101ReceiptHandleStrategy implements ReceiptHandleStrategy {
    @Override
    public void handle(Receipt receipt) {
        System.out.println("接收" + receipt.getMessage() + "信息");
        System.out.println("解析回执任务");
        System.out.println("执行业务逻辑" + receipt.getType());
        System.out.println("================================");
    }
}

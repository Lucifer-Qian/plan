package com.plan.dream.pattern.strategy.demo3;

import com.plan.dream.pattern.strategy.demo2.Receipt;
import com.plan.dream.pattern.strategy.demo2.ReceiptBuilder;
import com.plan.dream.pattern.strategy.demo3.handle.ReceiptStrategyContext;

import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo3
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/14 10:16
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        List<Receipt> reciptList = ReceiptBuilder.getReciptList();
        ReceiptStrategyContext receiptStrategyContext = new ReceiptStrategyContext();
        //初始化策略工厂
        ReceiptHandleStrategyFactory.init();
        for (Receipt receipt : reciptList) {
            //获取策略
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getStrategy(receipt);
            //设置策略
            receiptStrategyContext.setReceiptHandleStrategy(strategy);
            //执行策略
            receiptStrategyContext.handle(receipt);
        }
    }
}

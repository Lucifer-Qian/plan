package com.plan.dream.pattern.strategy.demo3;

import com.plan.dream.pattern.strategy.demo2.Receipt;
import com.plan.dream.pattern.strategy.demo3.handle.MT1101ReceiptHandleStrategy;
import com.plan.dream.pattern.strategy.demo3.handle.MT2101ReceiptHandleStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo3
 * @ClassName: ReceiptHandleStrategyFactory
 * @author: Rocky Qian
 * @description: 策略工厂
 * @date: 2023/11/14 10:18
 * @version: 1.0
 */
public class ReceiptHandleStrategyFactory {

    public ReceiptHandleStrategyFactory(){}

    //适用Map集合彻底消除if...else

    private static Map<String, ReceiptHandleStrategy> stringReceiptMap;

    //初始化
    public static void init(){
        stringReceiptMap = new HashMap<>();
        stringReceiptMap.put("MT1101",new MT1101ReceiptHandleStrategy());
        stringReceiptMap.put("MT2101",new MT2101ReceiptHandleStrategy());
    }


    //根据回执类型，获取对象的策略对象

    public static ReceiptHandleStrategy getStrategy(Receipt receipt){
       return stringReceiptMap.get(receipt.getType());
    }
}

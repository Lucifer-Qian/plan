package com.plan.dream.pattern.strategy.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo2
 * @ClassName: ReceiptBuilder
 * @author: Rocky Qian
 * @description: 回执信息生成
 * @date: 2023/11/14 9:55
 * @version: 1.0
 */
public class ReceiptBuilder {

    public static List<Receipt> getReciptList(){

        //模拟回执信息
        List<Receipt> receipts = new ArrayList<>();

        receipts.add(new Receipt("MT1101回执信息","MT1101"));
        receipts.add(new Receipt("MT2101回执信息","MT2101"));
        //receipts.add(new Receipt("MT4101回执信息","MT4101"));
        //receipts.add(new Receipt("MT4101回执信息","MT4101"));
        return receipts;
    }
}

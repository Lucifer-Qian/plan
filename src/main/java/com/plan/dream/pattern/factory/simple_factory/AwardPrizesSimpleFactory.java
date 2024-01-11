package com.plan.dream.pattern.factory.simple_factory;


import com.plan.dream.pattern.factory.service.PrizeService;
import com.plan.dream.pattern.factory.service.impl.JdCardImpl;
import com.plan.dream.pattern.factory.service.impl.WeChatImpl;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.simple_factory
 * @ClassName: AwardPrizesFactry
 * @author: Rocky Qian
 * @description: 发奖工厂
 * @date: 2023/10/26 15:24
 * @version: 1.0
 */
public class AwardPrizesSimpleFactory {


    /**
     * 发卡工厂类
     *
     * @param type
     * @return com.plan.dream.pattern.factory.service.LotteryDrawInterService
     * @throws
     * @method awardPrizes
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/26 15:29
     */
/*    public static PrizeService awardPrizes(int type){
        PrizeService result = null;
        if (type ==1){
             result = new JdCardImpl();
        }else if (type ==2){
             result = new WeChatImpl();
        }
        return result;
    }*/
}

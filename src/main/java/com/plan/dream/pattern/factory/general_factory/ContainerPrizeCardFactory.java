package com.plan.dream.pattern.factory.general_factory;

import com.plan.dream.pattern.factory.general_factory.impl.AwardJdCardImpl;
import com.plan.dream.pattern.factory.general_factory.impl.AwardWeChatImpl;
import com.plan.dream.pattern.factory.service.PrizeService;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.general_factory
 * @ClassName: ContainerPrizeCardFactory
 * @author: Rocky Qian
 * @description: 容器化
 * @date: 2023/10/26 15:46
 * @version: 1.0
 */
public class ContainerPrizeCardFactory {

    private final static ConcurrentHashMap<Integer, AwardPrizesGeneralFactory> CONTAINER = new ConcurrentHashMap<>();

    static {
        CONTAINER.put(1, new AwardJdCardImpl());
        CONTAINER.put(2, new AwardWeChatImpl());
    }

    /**
     * 发奖
     *
     * @param type
     * @return com.plan.dream.pattern.factory.service.PrizeService
     * @throws
     * @method awardPrizes
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/26 15:50
     */
    public PrizeService awardPrizes(int type) {
        AwardPrizesGeneralFactory awardPrizesGeneralFactory = CONTAINER.get(type);
        return awardPrizesGeneralFactory.getPrize().getData();
    }
}

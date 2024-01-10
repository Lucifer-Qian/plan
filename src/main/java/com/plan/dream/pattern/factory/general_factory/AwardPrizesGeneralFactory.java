package com.plan.dream.pattern.factory.general_factory;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.pattern.factory.service.PrizeService;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory
 * @ClassName: factory
 * @author: Rocky Qian
 * @description: 一般工厂
 * @date: 2023/10/26 15:30
 * @version: 1.0
 */
public interface AwardPrizesGeneralFactory {

    /**
     * 获取奖品
     *
     * @param
     * @return com.plan.dream.common.ReturnResult<com.plan.dream.pattern.factory.service.PrizeService>
     * @throws
     * @method getPrize
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/26 15:42
     */
    ReturnResult<PrizeService> getPrize();
}

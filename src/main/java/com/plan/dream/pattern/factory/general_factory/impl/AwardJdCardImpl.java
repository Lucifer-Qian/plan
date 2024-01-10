package com.plan.dream.pattern.factory.general_factory.impl;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.pattern.factory.general_factory.AwardPrizesGeneralFactory;
import com.plan.dream.pattern.factory.service.PrizeService;
import com.plan.dream.pattern.factory.service.impl.JdCardImpl;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.general_factory.impl
 * @ClassName: AwardJdCardImpl
 * @author: Rocky Qian
 * @description: 发京东卡
 * @date: 2023/10/26 15:36
 * @version: 1.0
 */
public class AwardJdCardImpl implements AwardPrizesGeneralFactory {

    @Override
    public ReturnResult<PrizeService> getPrize() {
        PrizeService jdCard = new JdCardImpl();
        return new ReturnResult<>(200, "成功", jdCard);
    }
}

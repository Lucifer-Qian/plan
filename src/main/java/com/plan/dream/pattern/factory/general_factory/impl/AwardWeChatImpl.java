package com.plan.dream.pattern.factory.general_factory.impl;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.pattern.factory.general_factory.AwardPrizesGeneralFactory;
import com.plan.dream.pattern.factory.service.PrizeService;
import com.plan.dream.pattern.factory.service.impl.WeChatImpl;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.general_factory.impl
 * @ClassName: AwardWeChatImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/26 15:36
 * @version: 1.0
 */
public class AwardWeChatImpl implements AwardPrizesGeneralFactory {

    @Override
    public ReturnResult<PrizeService> getPrize() {
        PrizeService weChat = new WeChatImpl();
        return new ReturnResult<>(200, "成功", weChat);
    }
}

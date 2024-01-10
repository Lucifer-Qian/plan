package com.plan.dream.pattern.factory.service;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.entry.Member;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.service.impl
 * @ClassName: LotteryDrawInterFace
 * @author: Rocky Qian
 * @description: 奖品
 * @date: 2023/10/26 15:13
 * @version: 1.0
 */
public interface PrizeService {

    /**
     * 奖品
     *
     * @param member 会员
     * @return com.plan.dream.common.ReturnResult<T>
     * @throws
     * @method awardPrizes
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/26 15:16
     */
     ReturnResult prize(Member member);

}

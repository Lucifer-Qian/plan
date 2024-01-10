package com.plan.dream.pattern.factory.service.impl;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.entry.Member;
import com.plan.dream.pattern.factory.service.PrizeService;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.service.impl
 * @ClassName: WeChaitImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/26 15:19
 * @version: 1.0
 */
public class WeChatImpl implements PrizeService {
    @Override
    public ReturnResult prize(Member member) {
        System.out.println("生成微信红包成功");
        return new ReturnResult<>(200,"成功");
    }
}

package com.plan.dream.pattern.factory.service.impl;

import com.plan.dream.common.ReturnResult;
import com.plan.dream.entry.Member;
import com.plan.dream.pattern.factory.service.PrizeService;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.factory.service.impl
 * @ClassName: JDCard
 * @author: Rocky Qian
 * @description: 发送JD卡
 * @date: 2023/10/26 15:18
 * @version: 1.0
 */
public class JdCardImpl implements PrizeService {
    @Override
    public ReturnResult prize(Member member) {
        System.out.println("生成京东卡成功");
        return new ReturnResult<>(200,"成功");
    }
}

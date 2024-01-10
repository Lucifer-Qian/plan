package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: LotteryServiceImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:46
 * @version: 1.0
 */
public class LotteryServiceImpl extends LotteryService {

    private DrawHouseService service = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uid) {
        final String lots = service.lots(uid);
        return new LotteryResult(uid, lots);
    }
}

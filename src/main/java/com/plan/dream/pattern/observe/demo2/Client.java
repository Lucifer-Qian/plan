package com.plan.dream.pattern.observe.demo2;

import java.util.UUID;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: Cltent
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:33
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        final LotteryServiceImpl lotteryService = new LotteryServiceImpl();

        while (true){
            lotteryService.lotteryAndMessage(UUID.randomUUID().toString());
            Thread.sleep(5000);
        }
    }
}

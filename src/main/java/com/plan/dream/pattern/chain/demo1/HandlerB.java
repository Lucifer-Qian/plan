package com.plan.dream.pattern.chain.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo1
 * @ClassName: HandlerB
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/20 15:23
 * @version: 1.0
 */
public class HandlerB extends Handler{


    @Override
    public void handle(RequestData requestData) {
        System.out.println("handlerB 执行处理请求" + requestData.getData());

        if (requestData.getData().contains("B")) {
            String replace = requestData.getData().replace("B", "");
            requestData.setData(replace);
            System.out.println("继续执行");
            successor.handle(requestData);
        } else {
            System.out.println("处理结束");
        }
    }
}

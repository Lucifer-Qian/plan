package com.plan.dream.pattern.chain.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo1
 * @ClassName: HandlerA
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/20 15:19
 * @version: 1.0
 */
public class HandlerA extends Handler {


    @Override
    public void handle(RequestData requestData) {
        System.out.println("handlerA 执行处理请求" + requestData.getData());

        if (requestData.getData().contains("A")) {
            String replace = requestData.getData().replace("A", "");
            requestData.setData(replace);
            System.out.println("继续执行");
            successor.handle(requestData);
        } else {
            System.out.println("处理结束");
        }
    }
}

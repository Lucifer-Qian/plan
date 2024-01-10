package com.plan.dream.pattern.chain.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo1
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/20 15:25
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        HandlerA a = new HandlerA();
        HandlerB b = new HandlerB();
        HandlerC c = new HandlerC();

        //创建处理链
        a.setSuccessor(b);
        b.setSuccessor(c);
        c.setSuccessor(c);
        RequestData requestData = new RequestData("请求数据ABCD");
        a.handle(requestData);
    }
}

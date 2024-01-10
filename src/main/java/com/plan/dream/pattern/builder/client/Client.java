package com.plan.dream.pattern.builder.client;

import com.plan.dream.pattern.builder.director.Director;
import com.plan.dream.pattern.builder.service.impl.AppleBuilder;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.service.client
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 14:17
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建一个指挥者，传参要具体的构造者
        final Director director = new Director(new AppleBuilder());

        //获取电脑
        System.out.println(director.construct());

    }

}

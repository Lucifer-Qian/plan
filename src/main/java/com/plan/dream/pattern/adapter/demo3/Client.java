package com.plan.dream.pattern.adapter.demo3;

import com.plan.dream.pattern.adapter.demo3.adapter.SdAdapterTf;
import com.plan.dream.pattern.adapter.demo3.computer.Computer;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3
 * @ClassName: client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:56
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(new Computer().read(new SdAdapterTf()));
    }
}

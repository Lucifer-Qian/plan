package com.plan.dream.pattern.builder.service.impl;

import com.plan.dream.pattern.builder.service.Builder;
import com.plan.dream.pattern.builder.entity.Computer;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.service.impl
 * @ClassName: AppleBuilder
 * @author: Rocky Qian
 * @description: 具体构造者
 * @date: 2023/10/27 14:16
 * @version: 1.0
 */
public class AppleBuilder extends Builder {

    @Override
    public void buildCpu() {
        System.out.println("制作苹果Cpu");
        computer.setCpu("苹果CPU");
    }

    @Override
    public void builderMotherBoard() {
        System.out.println("制作苹果主板");
        computer.setMotherBoard("苹果主板");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}

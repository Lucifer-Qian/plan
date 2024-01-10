package com.plan.dream.pattern.builder.service.impl;

import com.plan.dream.pattern.builder.service.Builder;
import com.plan.dream.pattern.builder.entity.Computer;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.service.impl
 * @ClassName: LenovoBuilder
 * @author: Rocky Qian
 * @description: 具体构造者
 * @date: 2023/10/27 14:17
 * @version: 1.0
 */
public class LenovoBuilder extends Builder {

    @Override
    public void buildCpu() {
        System.out.println("制作联想Cpu");
        computer.setCpu("联想CPU");
    }

    @Override
    public void builderMotherBoard() {
        System.out.println("联想苹果主板");
        computer.setMotherBoard("联想主板");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}

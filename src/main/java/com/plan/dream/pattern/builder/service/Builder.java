package com.plan.dream.pattern.builder.service;

import com.plan.dream.pattern.builder.entity.Computer;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.service
 * @ClassName: Builder
 * @author: Rocky Qian
 * @description: 构造者类
 * @date: 2023/10/27 14:12
 * @version: 1.0
 */
public abstract class Builder {

    /**
     * 让具体构建者构建
     */
    protected Computer computer = new Computer();

    /**
     * 建造cpu
     *
     * @param
     * @return void
     * @throws
     * @method buildCpu
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 14:15
     */
    public abstract void buildCpu();

    /**
     * 建造主板
     *
     * @param
     * @return void
     * @throws
     * @method builderMotherBoard
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 14:15
     */
    public abstract void builderMotherBoard();

    /**
     * 生产电脑
     *
     * @param
     * @return com.plan.dream.pattern.builder.service.com.plan.dream.entity.Computer
     * @throws
     * @method createComputer
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 14:15
     */
    public abstract Computer createComputer();

}

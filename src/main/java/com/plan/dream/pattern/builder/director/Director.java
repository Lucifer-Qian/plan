package com.plan.dream.pattern.builder.director;

import com.plan.dream.pattern.builder.entity.Computer;
import com.plan.dream.pattern.builder.service.Builder;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.service.director
 * @ClassName: Director
 * @author: Rocky Qian
 * @description: 指挥者类
 * @date: 2023/10/27 14:18
 * @version: 1.0
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct(){
        builder.buildCpu();
        builder.builderMotherBoard();
        return builder.createComputer();
    }
}

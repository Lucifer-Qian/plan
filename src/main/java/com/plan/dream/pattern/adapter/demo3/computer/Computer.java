package com.plan.dream.pattern.adapter.demo3.computer;

import com.plan.dream.pattern.adapter.demo3.SdCard;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3.computer
 * @ClassName: Computer
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:54
 * @version: 1.0
 */
public class Computer {

    /**
     * 读取sd卡
     *
     * @param sdCard
     * @return java.lang.String
     * @throws
     * @method read
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:56
     */
    public String read(SdCard sdCard){

        return sdCard.readSd();
    }

}

package com.plan.dream.pattern.adapter.demo3.impl;

import com.plan.dream.pattern.adapter.demo3.SdCard;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3.impl
 * @ClassName: SdCardImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:50
 * @version: 1.0
 */
public class SdCardImpl implements SdCard {


    /**
     * 写入数据
     *
     * @param msg
     * @return void
     * @throws
     * @method writeSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:50
     */
    @Override
    public void writeSd(String msg) {
        System.out.println("成功写入Sd卡数据");
    }

    /**
     * 读取数据成功
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method readSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:50
     */
    @Override
    public String readSd() {
        System.out.println("成功读取Sd卡数据");
        return "200";
    }
}

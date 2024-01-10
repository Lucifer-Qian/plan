package com.plan.dream.pattern.adapter.demo3.impl;

import com.plan.dream.pattern.adapter.demo3.TfCard;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3.impl
 * @ClassName: TfCardImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:52
 * @version: 1.0
 */
public class TfCardImpl implements TfCard {

    /**
     *
     *
     * @param msg
     * @return void
     * @throws
     * @method writeTf
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:52
     */
    @Override
    public void writeTf(String msg) {
        System.out.println("成功写入Tf卡数据");
    }

    @Override
    public String readTf() {
        System.out.println("成功读取Tf卡数据");
        return "200";
    }
}

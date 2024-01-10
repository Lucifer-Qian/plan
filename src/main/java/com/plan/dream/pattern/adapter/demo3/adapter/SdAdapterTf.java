package com.plan.dream.pattern.adapter.demo3.adapter;

import com.plan.dream.pattern.adapter.demo3.SdCard;
import com.plan.dream.pattern.adapter.demo3.impl.TfCardImpl;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3.adapter
 * @ClassName: SdAdapterTf
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:53
 * @version: 1.0
 */
public class SdAdapterTf extends TfCardImpl implements SdCard {

    /**
     * 写适配器
     *
     * @param msg
     * @return void
     * @throws
     * @method writeSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:58
     */
    @Override
    public void writeSd(String msg) {
        System.out.println("适配器写入Tf");
        writeTf(msg);
    }

    /**
     * 读适配器
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method readSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:58
     */
    @Override
    public String readSd() {
        System.out.println("适配器读取Tf");
        return readTf();
    }
}

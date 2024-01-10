package com.plan.dream.pattern.adapter.demo3;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3
 * @ClassName: TfCard
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:52
 * @version: 1.0
 */
public interface TfCard {


    /**
     * 写入Tf卡
     *
     * @param msg
     * @return void
     * @throws
     * @method writeSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:49
     */
    void writeTf(String msg);

    /**
     * 读取Tf
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method readSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:49
     */
    String readTf();
}

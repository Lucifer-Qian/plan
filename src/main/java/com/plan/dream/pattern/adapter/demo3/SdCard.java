package com.plan.dream.pattern.adapter.demo3;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.adapter.demo3
 * @ClassName: SdCard
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 13:48
 * @version: 1.0
 */
public interface SdCard {

    /**
     * 写入sd卡
     *
     * @param msg
     * @return void
     * @throws
     * @method writeSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:49
     */
    void writeSd(String msg);

    /**
     * 读取sd
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method readSd
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 13:49
     */
    String readSd();
}

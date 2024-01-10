package com.plan.dream.pattern.decorator.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator.demo2
 * @ClassName: DataLoad
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/1 17:07
 * @version: 1.0
 */
public abstract class DataLoad {

    /**
     * 读取文件
     *
     * @param
     * @return void
     * @throws
     * @method readFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:08
     */
    public abstract void readFile();

    /**
     * 写入文件
     *
     * @param
     * @return void
     * @throws
     * @method writeFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:08
     */
    public abstract void writeFile();
}

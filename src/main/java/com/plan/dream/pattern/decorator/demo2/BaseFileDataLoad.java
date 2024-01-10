package com.plan.dream.pattern.decorator.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator.demo2
 * @ClassName: BaseFileDataLoad
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/1 17:08
 * @version: 1.0
 */
public class BaseFileDataLoad extends DataLoad {

    /**
     * 读取文件
     *
     * @param
     * @return void
     * @throws
     * @method readFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:09
     */
    @Override
    public void readFile() {
        System.out.println("读取文件");
    }

    /**
     * 写入文件
     *
     * @param
     * @return void
     * @throws
     * @method writeFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:09
     */
    @Override
    public void writeFile() {

        System.out.println("写入文件");

    }
}

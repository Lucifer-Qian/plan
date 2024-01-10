package com.plan.dream.pattern.decorator.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator.demo2
 * @ClassName: DataLoadDecorator
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/1 17:10
 * @version: 1.0
 */
public class DataLoadDecorator extends DataLoad {

    protected DataLoad dataLoad;

    public DataLoadDecorator(DataLoad dataLoad) {
        this.dataLoad = dataLoad;
    }


    /**
     * 基本操作
     *
     * @param
     * @return void
     * @throws
     * @method readFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:11
     */
    @Override
    public void readFile() {
        dataLoad.readFile();
    }

    /**
     * 基本操作
     *
     * @param
     * @return void
     * @throws
     * @method writeFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:11
     */
    @Override
    public void writeFile() {
        dataLoad.writeFile();
    }
}

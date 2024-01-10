package com.plan.dream.pattern.decorator.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator.demo2
 * @ClassName: EnctyDataLoadDecorator
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/1 17:11
 * @version: 1.0
 */
public class EncryptionDataLoadDecorator extends DataLoadDecorator {

    public EncryptionDataLoadDecorator(DataLoad dataLoad) {
        super(dataLoad);
    }


    /**
     * 装饰
     *
     * @param
     * @return void
     * @throws
     * @method readFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:12
     */
    @Override
    public void readFile() {
        this.decode();
        super.readFile();
    }

    /**
     * 装饰
     *
     * @param
     * @return void
     * @throws
     * @method writeFile
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:12
     */
    @Override
    public void writeFile() {
        this.encode();
        super.writeFile();
    }



    /**
     * 加密
     *
     * @param
     * @return void
     * @throws
     * @method encode
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:12
     */
    public void encode(){
        System.out.println("加密");
    }


    /**
     * 解密
     *
     * @param
     * @return void
     * @throws
     * @method encode
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 17:12
     */
    public void decode(){
        System.out.println("解密");
    }

}

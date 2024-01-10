package com.plan.dream.pattern.composite.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite.demo2
 * @ClassName: Entry
 * @author: Rocky Qian
 * @description: 抽象根节点
 * @date: 2023/11/3 10:01
 * @version: 1.0
 */
public abstract class Entry {

    /**
     * 获取名字
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method getName
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 10:21
     */
    public abstract String getName();

    /**
     * 获取大小
     *
     * @param
     * @return int
     * @throws
     * @method getSize
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 10:21
     */
    public abstract int getSize();

    /**
     * 打印
     *
     * @param
     * @return void
     * @throws
     * @method print
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 10:22
     */
    public abstract void print();

    /**
     * 新增
     *
     * @param entry
     * @return com.plan.dream.pattern.composite.demo2.Entry
     * @throws
     * @method add
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 11:18
     */
    public abstract Entry add(Entry entry);


}

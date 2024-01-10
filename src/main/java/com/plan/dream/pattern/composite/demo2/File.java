package com.plan.dream.pattern.composite.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite.demo2
 * @ClassName: File
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/3 10:20
 * @version: 1.0
 */
public class File extends Entry {

    private String name;

    private int size;

    public File(String name ,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

}

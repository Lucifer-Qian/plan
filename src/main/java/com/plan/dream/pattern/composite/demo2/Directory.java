package com.plan.dream.pattern.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite.demo2
 * @ClassName: Directory
 * @author: Rocky Qian
 * @description: 文件夹
 * @date: 2023/11/3 10:18
 * @version: 1.0
 */
public class Directory extends Entry {

    /**
     * 文件夹和问价
     */
    private List<Entry> entries = new ArrayList<Entry>();

    /**
     * 文件名
     */
    private String name;

    public Directory(List<Entry> entries, String name) {
        this.entries = entries;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }
}

package com.plan.dream.demo;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.demo
 * @ClassName: A
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/14 17:12
 * @version: 1.0
 */
public class A implements I{
    @Override
    public String m(int p) {
        return "A";
    }

    @Override
    public String m(String p) {
        return "B";
    }
}

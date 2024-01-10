package com.plan.dream.pattern.singleton;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.singleton
 * @ClassName: SingletonEnum
 * @author: Rocky Qian
 * @description: 枚举单例
 * @date: 2023/10/25 14:37
 * @version: 1.0
 */
public enum SingletonEnum {

    /**
     * 注释
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

}

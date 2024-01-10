package com.plan.dream.pattern.strategy.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.strategy.demo2
 * @ClassName: Recepit
 * @author: Rocky Qian
 * @description: 回执信息
 * @date: 2023/11/14 9:53
 * @version: 1.0
 */
public class Receipt {

    /**
     * message:回执内容
     * type:回执类型 MT1101.MT2101.MT4101.MT8101
     */
    private String message;
    private String type;

    public Receipt(){}

    public Receipt(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

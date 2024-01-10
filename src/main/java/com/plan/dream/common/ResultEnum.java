package com.plan.dream.common;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @Author: DanielCao
 * @Date: 2018年7月18日
 * @Time: 下午7:45:41
 */
public enum ResultEnum {

    SUCCESS(200, "SUCCESS", "成功"),
    PATH_NOT_FOUND(404, "PATH_NOT_FOUND", "请求地址不存在"),

    /**
     * 券参数错误
     */
    COUPON_TYPE_NULL_ERROR(4000, "COUPON_TYPE_NULL_ERROR", "类型不能为空"),

    /**
     * 系统错误99xx
     */
    DB_ERROR(9998, "DB_ERROR", "数据库异常"),
    FAILURE(9999, "FAILURE", "业务失败"),
    UNKNOWN(-1, "UNKNOWN", "未定义错误");

    private final int code;
    // private final String message;
    private String desc;

    ResultEnum(int code, String message, String desc) {
        this.code = code;
        // this.message = message;
        this.desc = desc;
    }

    public static ResultEnum valueOf(int code) {
        ResultEnum[] enums = values();
        if (enums.length == 0) {
            return UNKNOWN;
        }
        for (ResultEnum _enu : enums) {
            if (code == _enu.getCode()) {
                return _enu;
            }
        }
        return UNKNOWN;
    }

    public static ResultEnum getByName(String message) {
        ResultEnum[] enums = values();
        if (enums.length == 0) {
            return UNKNOWN;
        }
        for (ResultEnum _enu : enums) {
            if (message.equals(_enu.name())) {
                return _enu;
            }
        }
        return UNKNOWN;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

/*    public String getMessage() {
        return message;
    }*/

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        try {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("code", code)
                    // .append("message", message)
                    .append("desc", desc)
                    .toString();
        } catch (Exception e) {
            // NOTICE: 这样做的目的是避免由于toString()的异常导致系统异常终止
            // 大部分情况下，toString()用在日志输出等调试场景
            return super.toString();
        }
    }
}

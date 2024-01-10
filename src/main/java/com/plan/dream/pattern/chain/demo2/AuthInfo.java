package com.plan.dream.pattern.chain.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.chain.demo2
 * @ClassName: AuthInfo
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/27 17:13
 * @version: 1.0
 */
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String info : infos) {
            this.info = this.info.concat(info + " ");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

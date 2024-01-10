package com.plan.dream.pattern.observe.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.observe.demo2
 * @ClassName: DrawHouseService
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/6 14:42
 * @version: 1.0
 */
public class DrawHouseService {


    /**
     * 中签服务
     *
     * @param uid
     * @return java.lang.String
     * @throws
     * @method lots
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/6 14:43
     */
    public String lots(String uid) {
        if (uid.hashCode() % 2 == 0) {
            return "恭喜您，用户id为：" + uid + "中签！";
        } else {
            return "很抱歉，用户id为：" + uid + "没有中签";
        }
    }
}

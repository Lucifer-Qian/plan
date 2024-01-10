package com.plan.dream.pattern.flyweight.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo2
 * @ClassName: BlackGobang
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/3 17:07
 * @version: 1.0
 */
public class BlackGobang extends GobangFlyweight {


    /**
     * 获取颜色
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method getColor
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:10
     */
    @Override
    public String getColor() {
        return "黑色";
    }
}

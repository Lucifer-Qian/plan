package com.plan.dream.pattern.flyweight.demo2;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo2
 * @ClassName: GobangFlyweight
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/3 17:07
 * @version: 1.0
 */
public abstract class GobangFlyweight {


    /**
     * 获取颜色
     *
     * @param
     * @return java.lang.String
     * @throws
     * @method getColor
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:08
     */
    public abstract String getColor();


    /**
     * 显示
     *
     * @param
     * @return void
     * @throws
     * @method display
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:09
     */
    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}

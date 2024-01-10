package com.plan.dream.pattern.composite.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite
 * @ClassName: Component
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 17:40
 * @version: 1.0
 */
public abstract class Component {

    /**
     * 增加节点
     *
     * @param c
     * @return void
     * @throws
     * @method add
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 17:43
     */
    public abstract void add(Component c);

    /**
     * 移除节点
     *
     * @param c
     * @return void
     * @throws
     * @method remove
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 17:44
     */
    public abstract void remove(Component c);

    /**
     * 获取子节点
     *
     * @param i
     * @return com.plan.dream.pattern.composite.demo1.Component
     * @throws
     * @method getChild
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/2 17:44
     */
    public abstract Component getChild(int i);


    /**
     * 具体业务方法
     *
     * @param
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:54
     */
    public abstract void operation();
}

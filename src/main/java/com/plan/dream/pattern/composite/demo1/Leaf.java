package com.plan.dream.pattern.composite.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite.demo1
 * @ClassName: Leaf
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 17:56
 * @version: 1.0
 */
public class Leaf extends Component {

    /**
     * 新增
     *
     * @param c
     * @return void
     * @throws
     * @method add
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:58
     */
    @Override
    public void add(Component c) {

    }

    /**
     * 删除
     *
     * @param c
     * @return void
     * @throws
     * @method remove
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:58
     */
    @Override
    public void remove(Component c) {

    }

    /**
     * 无子节点
     *
     * @param i
     * @return com.plan.dream.pattern.composite.demo1.Component
     * @throws
     * @method getChild
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:58
     */
    @Override
    public Component getChild(int i) {
        return null;
    }

    /**
     * 叶子节点的方法
     *
     * @param
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:58
     */
    @Override
    public void operation() {
        System.out.println("叶子节点");
    }
}

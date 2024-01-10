package com.plan.dream.pattern.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.composite.demo1
 * @ClassName: Composite
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/2 17:45
 * @version: 1.0
 */
public class Composite extends Component {

    private List<Component> componentList = new ArrayList();


    /**
     * add
     *
     * @param c 对象
     * @return void
     * @throws
     * @method add
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:55
     */
    @Override
    public void add(Component c) {
        componentList.add(c);
    }

    /**
     * 移除 c
     *
     * @param c
     * @return void
     * @throws
     * @method remove
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:56
     */
    @Override
    public void remove(Component c) {
        componentList.remove(c);
    }

    /**
     * 获取子类
     *
     * @param i
     * @return com.plan.dream.pattern.composite.demo1.Component
     * @throws
     * @method getChild
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:56
     */
    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    /**
     * 具体业务方法
     *
     * @param
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 9:56
     */
    @Override
    public void operation() {
        System.out.println(componentList);
    }

}

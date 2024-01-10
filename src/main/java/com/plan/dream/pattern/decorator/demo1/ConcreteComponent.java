package com.plan.dream.pattern.decorator.demo1;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator
 * @ClassName: ConcrecteComponent
 * @author: Rocky Qian
 * @description: 具体构建类
 * @date: 2023/11/1 16:01
 * @version: 1.0
 */
public class ConcreteComponent extends Component {

    /**
     * 具体构建类的基本方法
     *
     * @param
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 16:02
     */
    @Override
    public void operation() {
        System.out.println("基本功能");
    }
}

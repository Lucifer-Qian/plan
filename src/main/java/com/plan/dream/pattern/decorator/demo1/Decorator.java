package com.plan.dream.pattern.decorator.demo1;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator
 * @ClassName: Decotator
 * @author: Rocky Qian
 * @description: 抽象装饰类-装饰着模式的核心
 * @date: 2023/11/1 16:02
 * @version: 1.0
 */
public class Decorator extends Component {

    /**
     * 维持一个对抽象构建对象的引用
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    /**
     * 装饰方法
     *
     * @param
     * @return void
     * @throws
     * @method operation
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 16:05
     */
    @Override
    public void operation() {
        //调用原有的业务方法，并没有真正的进行装饰，而且提供了一个统一的接口，将装饰的过程交给子类完成
        component.operation();
    }
}

package com.plan.dream.pattern.decorator.demo1;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.decorator
 * @ClassName: ConceteDecorator
 * @author: Rocky Qian
 * @description: 具体装饰类
 * @date: 2023/11/1 16:06
 * @version: 1.0
 */
public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }


    @Override
    public void operation() {
        //调用原有的方法
        super.operation();
        print();
    }


    /**
     * 装饰方法
     *
     * @param
     * @return void
     * @throws
     * @method print
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/1 16:09
     */
    public void print(){
        System.out.println("进行装饰");
    }
}

package com.plan.dream.pattern.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo1
 * @ClassName: FlyweightFactory
 * @author: Rocky Qian
 * @description: 享元资源池
 * @date: 2023/11/3 15:20
 * @version: 1.0
 */
public class FlyweightFactory {

    /**
     * 用于存储享元对象，充当享元池效果 存储了对象传递之间共有的状态，其实就是一创建这些对象时，就有这些状态
     */
    private Map<String, Flyweight> pool = new ConcurrentHashMap<>();

    /**
     * 让我们享元对象之间状态的传递
     *
     * @param
     * @return
     * @throws
     * @method FlyweightFactory
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 16:38
     */
    public FlyweightFactory() {
        //添加对应享元类内部状态
        pool.put("A", new ConcreteFlyweight("A"));
        pool.put("B", new ConcreteFlyweight("A"));
        pool.put("C", new ConcreteFlyweight("A"));
        pool.put("D", new ConcreteFlyweight("A"));
    }


    /**
     * @param key
     * @return com.plan.dream.pattern.flyweight.demo1.Flyweight
     * @throws
     * @method getFlyweight
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 16:41
     */
    public Flyweight getFlyweight(String key) {
        Flyweight result = null;

        if (pool.containsKey(key)) {
            System.out.println("享元池中存在，直接使用，key：" + key);
            result = pool.get(key);
        } else {
            System.out.println("享元池中不存在，先添加，key：" + key);
            result = new ConcreteFlyweight("A");
            pool.put(key, result);
        }
        return result;
    }

}

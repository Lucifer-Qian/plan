package com.plan.dream.pattern.flyweight.demo2;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.flyweight.demo2
 * @ClassName: GobangFactory
 * @author: Rocky Qian
 * @description:
 * @date: 2023/11/3 17:11
 * @version: 1.0
 */
public class GobangFactory {


    /**
     * 享元池
     */
    private final Map<String, GobangFlyweight> pool = new ConcurrentHashMap<>();

    /**
     * 初始化
     *
     * @param
     * @return
     * @throws
     * @method GobangFactory
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:21
     */
    private GobangFactory() {
        pool.put("b", new BlackGobang());
        pool.put("w", new WriteGobang());

    }

    /**
     * 静态内部类
     *
     * @param
     * @return com.plan.dream.pattern.flyweight.demo2.GobangFactory
     * @throws
     * @method getInstance
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:20
     */
    public static GobangFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }


    /**
     * 全局工厂所以用到单例
     */
    private static class SingletonHolder {
        private static final GobangFactory INSTANCE = new GobangFactory();
    }


    /**
     * 获取棋子
     *
     * @param key
     * @return com.plan.dream.pattern.flyweight.demo2.GobangFlyweight
     * @throws
     * @method getGobang
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/11/3 17:24
     */
    public GobangFlyweight getGobang(String key) {
        return pool.get(key);
    }

}

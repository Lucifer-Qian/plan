package com.plan.dream.pattern.proxy.dao.demo1.proxy;

import com.plan.dream.pattern.proxy.dao.demo1.MemberDao;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.dao.demo1.proxy
 * @ClassName: MemberDaoProsy
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/30 14:23
 * @version: 1.0
 */
public class MemberDaoProxy implements MemberDao{

    private MemberDao target;


    public MemberDaoProxy(MemberDao target){
        this.target = target;
    }


    /**
     * 代理
     *
     * @param
     * @return void
     * @throws
     * @method insert
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/30 14:25
     */
    @Override
    public void insert() {
        System.out.println("开始事务");
        target.insert();
        System.out.println("关闭事务");
    }
}

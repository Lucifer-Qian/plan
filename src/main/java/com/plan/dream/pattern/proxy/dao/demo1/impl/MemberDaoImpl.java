package com.plan.dream.pattern.proxy.dao.demo1.impl;

import com.plan.dream.pattern.proxy.dao.demo1.MemberDao;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.dao.demo1.impl
 * @ClassName: MemberDaoImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/30 14:22
 * @version: 1.0
 */
public class MemberDaoImpl  implements MemberDao {

    /**
     * insert
     *
     * @param
     * @return void
     * @throws
     * @method insert
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/30 14:22
     */
    @Override
    public void insert() {
        System.out.println("新增成功");
    }
}

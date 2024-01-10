package com.plan.dream.pattern.proxy.service;


import java.util.Collections;
import java.util.List;


/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.service
 * @ClassName: MemberServiceImpl
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/31 10:50
 * @version: 1.0
 */
public class MemberServiceImpl {

    /**
     * 获取会员
     *
     * @param
     * @return java.util.List<com.plan.dream.pattern.proxy.service.Member>
     * @throws
     * @method getMemberList
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/31 10:54
     */
    public void getMemberList() {
        final List<Member> list = Collections.singletonList(new Member("小明", 2));
        System.out.println(list);
    }
}

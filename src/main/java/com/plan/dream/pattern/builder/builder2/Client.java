package com.plan.dream.pattern.builder.builder2;

import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.builder2
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 16:04
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        final TodoWorkBuilder build = new TodoWorkBuilder.Builder().setId(1L).setType(1).
                setEventId(2L).setPlazaId(1231).setStoreId(321).
                setBindType(1).setRoleType(32).setUserId(23L).
                setCreateTime(new Date()).setContent("321312312").build();
        build.send();
    }
}

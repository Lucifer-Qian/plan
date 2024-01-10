package com.plan.dream.entry;

import lombok.Data;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.entry
 * @ClassName: User
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/26 15:15
 * @version: 1.0
 */
@Data
public class Member {

    private Long userId;
    private String userName;
    private String phone;
}

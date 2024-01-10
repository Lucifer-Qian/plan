package com.plan.dream.pattern.proxy.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.proxy.service
 * @ClassName: Member
 * @author: Rocky Qian
 * @description: 会员
 * @date: 2023/10/31 10:49
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private String name;
    private Integer age;

}

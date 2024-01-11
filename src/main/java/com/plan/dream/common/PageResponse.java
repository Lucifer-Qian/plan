package com.plan.dream.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    // 当前页码
    private Integer pageIndex;

    // 每页数量
    private Integer pageSize;

    // 总记录数
    private Integer totalSize;

    // 结果集
    private List<T> list;
}

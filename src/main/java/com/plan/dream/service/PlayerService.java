package com.plan.dream.service;


import com.plan.dream.common.PageResponse;
import com.plan.dream.entity.Player;

/**
 * (Player)表服务接口
 *
 * @author makejava
 * @since 2024-01-10 17:43:28
 */
public interface PlayerService {


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Player queryById(Integer id);

    /**
     * 分页查询
     *
     * @param player 筛选条件
     * @param pageIndex     页码
     * @param pageSize      展示条目数
     * @return 查询结果
     */
    PageResponse<Player> queryByPage(Player player, Integer pageIndex, Integer pageSize);

    /**
     * 新增数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    Player insert(Player player);

    /**
     * 修改数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    Player update(Player player);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}

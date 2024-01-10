package com.plan.dream.service.impl;


import com.plan.dream.dao.PlayerDao;
import com.plan.dream.entity.Player;
import com.plan.dream.service.PlayerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Player)表服务实现类
 *
 * @author makejava
 * @since 2024-01-10 17:43:29
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
    @Resource
    private PlayerDao playerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Player queryById(Integer id) {
        return this.playerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param player 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Player> queryByPage(Player player, PageRequest pageRequest) {
        long total = this.playerDao.count(player);
        return new PageImpl<>(this.playerDao.queryAllByLimit(player, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    @Override
    public Player insert(Player player) {
        this.playerDao.insert(player);
        return player;
    }

    /**
     * 修改数据
     *
     * @param player 实例对象
     * @return 实例对象
     */
    @Override
    public Player update(Player player) {
        this.playerDao.update(player);
        return this.queryById(player.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.playerDao.deleteById(id) > 0;
    }
}

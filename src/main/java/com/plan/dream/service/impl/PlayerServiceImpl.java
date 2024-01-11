package com.plan.dream.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.plan.dream.common.PageResponse;
import com.plan.dream.dao.PlayerDao;
import com.plan.dream.entity.Player;
import com.plan.dream.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Player)表服务实现类
 *
 * @author makejava
 * @since 2024-01-10 17:43:29
 */
@Service
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
     * @param pageIndex     页码
     * @param pageSize      展示条目数
     * @return 查询结果
     */
    @Override
    public PageResponse<Player> queryByPage(Player player, Integer pageIndex, Integer pageSize) {
        if (null == pageIndex || pageIndex <= 0) {
            pageIndex = 1;
        }
        if (null == pageSize || pageSize <= 0) {
            pageSize = 10;
        }
        Page<Integer> page = PageHelper.startPage(pageIndex, pageSize);
        List<Player> result = this.playerDao.queryAllByLimit(player);
        PageResponse<Player> pageResponse = new PageResponse<>();
        pageResponse.setTotalSize(page != null ? (int) page.getTotal() : result.size());
        pageResponse.setList(result);
        pageResponse.setPageIndex(pageIndex);
        pageResponse.setPageSize(pageSize);
        return pageResponse;
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

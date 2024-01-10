package com.plan.dream.controller;

import com.plan.dream.entity.Player;
import com.plan.dream.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: plan
 * @Package: com.plan.dream.controller
 * @ClassName: NBAController
 * @author: Rocky Qian
 * @description:
 * @date: 2024/1/10 17:20
 * @version: 1.0
 */

@RequestMapping("/nba")
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    /**
     * 模糊查询10条
     *
     * @param player 球员名称
     * @return void
     * @throws
     * @method playerInfo
     * @author Rocky Qian
     * @version 1.0
     * @date 2024/1/10 17:22
     */
    @GetMapping("/select")
    public Page<Player> playerInfo(Player player, PageRequest pageRequest) {
        return playerService.queryByPage(player, pageRequest);
    }
}

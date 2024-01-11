package com.plan.dream.controller;

import com.plan.dream.common.PageResponse;
import com.plan.dream.entity.Player;
import com.plan.dream.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: plan
 * @Package: com.plan.dream.controller
 * @ClassName: NBAController
 * @author: Rocky Qian
 * @description:
 * @date: 2024/1/10 17:20
 * @version: 1.0
 */

@RequestMapping("/player")
@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    /**
     * 模糊查询10条
     *
     * @param name 球员名称
     * @return void
     * @throws
     * @method playerInfo
     * @author Rocky Qian
     * @version 1.0
     * @date 2024/1/10 17:22
     */
    @GetMapping("/select")
    public PageResponse<Player> playerInfo(@RequestParam("name") String name, @RequestParam("pageIndex") Integer pageIndex, @RequestParam("pageRow") Integer pageRow) {
        Player player = new Player();
        player.setName(name);
        return playerService.queryByPage(player, pageIndex, pageRow);
    }
}

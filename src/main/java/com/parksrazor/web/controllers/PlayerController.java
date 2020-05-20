package com.parksrazor.web.controllers;

import com.parksrazor.web.domains.PlayerDTO;
import com.parksrazor.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;

    @GetMapping("")
    public List<PlayerDTO> list(){

        return playerService.retrieveAll();
    }

    @PostMapping("/{playerId}/access")
    public PlayerDTO login(
            @PathVariable String playerId,
            @RequestBody PlayerDTO params){
        System.out.println("뷰와 연결이 성공 !!! 아이디는 "+playerId);
        System.out.println("뷰와 연결이 성공 !!! 비번은 "+params.getBackNo());
        return player;
    }
}

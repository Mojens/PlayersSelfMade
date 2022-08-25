package com.example.forstedagtrejdesemesterpt2.api;

import com.example.forstedagtrejdesemesterpt2.entity.Player;
import com.example.forstedagtrejdesemesterpt2.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

  PlayerRepository playerRepository;

  public PlayerController(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @GetMapping
  Iterable<Player> getPlayers() {
    return  playerRepository.findAll();
  }
}



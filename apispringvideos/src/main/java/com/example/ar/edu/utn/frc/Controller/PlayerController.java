package com.example.ar.edu.utn.frc.Controller;

import com.example.ar.edu.utn.frc.Entities.PlayerEntitiy;
import com.example.ar.edu.utn.frc.Models.Player;
import com.example.ar.edu.utn.frc.Services.PlayerService;
import com.example.ar.edu.utn.frc.repositories.jpa.PlayerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public ResponseEntity<Player> getById(@PathVariable Long id){

        return ResponseEntity.ok(playerService.getPlayerById(id));
    }
}

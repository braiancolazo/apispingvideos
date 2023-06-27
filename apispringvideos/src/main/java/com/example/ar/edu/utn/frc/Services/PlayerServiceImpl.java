package com.example.ar.edu.utn.frc.Services;

import com.example.ar.edu.utn.frc.Entities.PlayerEntitiy;
import com.example.ar.edu.utn.frc.Models.Player;
import com.example.ar.edu.utn.frc.repositories.jpa.PlayerJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements  PlayerService{
    @Autowired
    private PlayerJpaRepository playerJpaRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Player getPlayerById(Long id) {
        PlayerEntitiy playerEntitiy = playerJpaRepository.getReferenceById(id);
        Player player = modelMapper.map(playerEntitiy,Player.class);

        return player;
    }
}

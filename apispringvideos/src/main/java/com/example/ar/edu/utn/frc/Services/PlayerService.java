package com.example.ar.edu.utn.frc.Services;

import com.example.ar.edu.utn.frc.Models.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    Player getPlayerById(Long id);
}

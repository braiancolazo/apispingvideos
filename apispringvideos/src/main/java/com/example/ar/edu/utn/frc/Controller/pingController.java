package com.example.ar.edu.utn.frc.Controller;

import com.example.ar.edu.utn.frc.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pingController {



    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }
}

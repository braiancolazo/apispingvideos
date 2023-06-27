package com.example.ar.edu.utn.frc.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Player {

    Long id;
    String userName;
    String password;
    String  email;
    String avatar;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    LocalDateTime lastLogin;

}

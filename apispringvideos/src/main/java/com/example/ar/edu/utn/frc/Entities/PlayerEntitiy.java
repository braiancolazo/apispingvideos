package com.example.ar.edu.utn.frc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "players")

public class PlayerEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    String userName;
    @Column
    String password;
    @Column
    String  email;
    @Column
    String avatar;
    @Column
    LocalDateTime lastLogin;
    @Column
    LocalDateTime createdAt;
    @Column
    LocalDateTime updatedAt;

}

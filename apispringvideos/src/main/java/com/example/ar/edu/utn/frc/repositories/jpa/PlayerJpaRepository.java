package com.example.ar.edu.utn.frc.repositories.jpa;

import com.example.ar.edu.utn.frc.Entities.PlayerEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerJpaRepository extends JpaRepository<PlayerEntitiy,Long> {

}

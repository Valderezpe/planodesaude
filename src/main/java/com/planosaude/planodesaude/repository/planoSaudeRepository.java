package com.planosaude.planodesaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planosaude.planodesaude.entity.plano;

public interface planoSaudeRepository extends JpaRepository <plano, Long> {
    
}

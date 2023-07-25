package com.example.restaurante.repository;

import com.example.restaurante.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClaim extends JpaRepository <Claim,Long> {
}

package com.example.restaurante.repository;

import com.example.restaurante.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOrder extends JpaRepository <Order, Long> {
}

package com.example.restaurante.repository;
import com.example.restaurante.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMenu extends JpaRepository<Menu, Long> {



}

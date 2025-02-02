package com.example.kahvikauppa.repository;

import com.example.kahvikauppa.model.Osasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsastoRepository extends JpaRepository<Osasto, Long> {
} 
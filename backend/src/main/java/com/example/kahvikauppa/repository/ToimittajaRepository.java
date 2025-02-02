package com.example.kahvikauppa.repository;

import com.example.kahvikauppa.model.Toimittaja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToimittajaRepository extends JpaRepository<Toimittaja, Long> {
}
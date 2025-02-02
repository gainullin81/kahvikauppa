package com.example.kahvikauppa.repository;

import com.example.kahvikauppa.model.Tuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuoteRepository extends JpaRepository<Tuote, Long> {
}
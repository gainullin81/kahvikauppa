package com.example.kahvikauppa.repository;

import com.example.kahvikauppa.model.Valmistaja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValmistajaRepository extends JpaRepository<Valmistaja, Long> {
}
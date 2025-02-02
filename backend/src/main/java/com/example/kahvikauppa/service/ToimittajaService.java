package com.example.kahvikauppa.service;

import com.example.kahvikauppa.model.Toimittaja;
import com.example.kahvikauppa.repository.ToimittajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@Slf4j
public class ToimittajaService {
    private final ToimittajaRepository toimittajaRepository;

    @Autowired
    public ToimittajaService(ToimittajaRepository toimittajaRepository) {
        this.toimittajaRepository = toimittajaRepository;
    }

    public List<Toimittaja> findAll() {
        return toimittajaRepository.findAll();
    }
}
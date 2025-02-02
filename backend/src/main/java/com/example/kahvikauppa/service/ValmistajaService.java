package com.example.kahvikauppa.service;

import com.example.kahvikauppa.model.Valmistaja;
import com.example.kahvikauppa.repository.ValmistajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@Slf4j
public class ValmistajaService {
    private final ValmistajaRepository valmistajaRepository;

    @Autowired
    public ValmistajaService(ValmistajaRepository valmistajaRepository) {
        this.valmistajaRepository = valmistajaRepository;
    }

    public List<Valmistaja> findAll() {
        return valmistajaRepository.findAll();
    }
}
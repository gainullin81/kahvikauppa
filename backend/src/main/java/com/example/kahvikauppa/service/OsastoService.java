package com.example.kahvikauppa.service;

import com.example.kahvikauppa.model.Osasto;
import com.example.kahvikauppa.repository.OsastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@Slf4j
public class OsastoService {
    private final OsastoRepository osastoRepository;

    @Autowired
    public OsastoService(OsastoRepository osastoRepository) {
        this.osastoRepository = osastoRepository;
    }

    public List<Osasto> findAll() {
        return osastoRepository.findAll();
    }
}
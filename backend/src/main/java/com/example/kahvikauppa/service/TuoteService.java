package com.example.kahvikauppa.service;

import com.example.kahvikauppa.model.Tuote;
import com.example.kahvikauppa.repository.TuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@Slf4j
public class TuoteService {
    private final TuoteRepository tuoteRepository;

    @Autowired
    public TuoteService(TuoteRepository tuoteRepository) {
        this.tuoteRepository = tuoteRepository;
    }

    public List<Tuote> findAll() {
        return tuoteRepository.findAll();
    }

    public Tuote save(Tuote tuote) {
        return tuoteRepository.save(tuote);
    }
}
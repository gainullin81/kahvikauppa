package com.example.kahvikauppa.controller;

import com.example.kahvikauppa.model.Tuote;
import com.example.kahvikauppa.service.TuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tuote")
@CrossOrigin(origins = "http://localhost:3000")
public class TuoteController {
    private final TuoteService tuoteService;

    @Autowired
    public TuoteController(TuoteService tuoteService) {
        this.tuoteService = tuoteService;
    }

    @GetMapping
    public ResponseEntity<List<Tuote>> getAllTuotteet() {
        return ResponseEntity.ok(tuoteService.findAll());
    }

    @PostMapping
    public ResponseEntity<Tuote> createTuote(@RequestBody Tuote tuote) {
        return ResponseEntity.ok(tuoteService.save(tuote));
    }
}
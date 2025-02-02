package com.example.kahvikauppa.controller;

import com.example.kahvikauppa.model.Toimittaja;
import com.example.kahvikauppa.service.ToimittajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/toimittaja")
@CrossOrigin(origins = "http://localhost:3000")
public class ToimittajaController {
    private final ToimittajaService toimittajaService;

    @Autowired
    public ToimittajaController(ToimittajaService toimittajaService) {
        this.toimittajaService = toimittajaService;
    }

    @GetMapping
    public ResponseEntity<List<Toimittaja>> getAllToimittajat() {
        return ResponseEntity.ok(toimittajaService.findAll());
    }
}
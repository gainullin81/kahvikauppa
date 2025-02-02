package com.example.kahvikauppa.controller;

import com.example.kahvikauppa.model.Valmistaja;
import com.example.kahvikauppa.service.ValmistajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/valmistaja")
@CrossOrigin(origins = "http://localhost:3000")
public class ValmistajaController {
    private final ValmistajaService valmistajaService;

    @Autowired
    public ValmistajaController(ValmistajaService valmistajaService) {
        this.valmistajaService = valmistajaService;
    }

    @GetMapping
    public ResponseEntity<List<Valmistaja>> getAllValmistajat() {
        return ResponseEntity.ok(valmistajaService.findAll());
    }
}
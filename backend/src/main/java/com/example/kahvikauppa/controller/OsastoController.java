package com.example.kahvikauppa.controller;

import com.example.kahvikauppa.model.Osasto;
import com.example.kahvikauppa.service.OsastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/osasto")
@CrossOrigin(origins = "http://localhost:3000")
public class OsastoController {
    private final OsastoService osastoService;

    @Autowired
    public OsastoController(OsastoService osastoService) {
        this.osastoService = osastoService;
    }

    @GetMapping
    public ResponseEntity<List<Osasto>> getAllOsastot() {
        return ResponseEntity.ok(osastoService.findAll());
    }
}
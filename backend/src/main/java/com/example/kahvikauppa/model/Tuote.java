package com.example.kahvikauppa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tuote")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tuote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nimi")
    private String nimi;

    @Column(name = "hinta")
    private Double hinta;

    @Column(name = "kuvaus")
    private String kuvaus;

    @Column(name = "kuva")
    private String kuva;

    @ManyToOne
    @JoinColumn(name = "osasto_id")
    private Osasto osasto;

    @ManyToOne
    @JoinColumn(name = "toimittaja_id")
    private Toimittaja toimittaja;

    @ManyToOne
    @JoinColumn(name = "valmistaja_id")
    private Valmistaja valmistaja;
}
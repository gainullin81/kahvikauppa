package com.example.kahvikauppa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "osasto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Osasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nimi")
    private String nimi;

    @Column(name = "kuvaus")
    private String kuvaus;
}
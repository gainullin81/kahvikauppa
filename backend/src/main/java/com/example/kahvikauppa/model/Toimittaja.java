package com.example.kahvikauppa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "toimittaja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Toimittaja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nimi")
    private String nimi;

    @Column(name = "yhteystiedot")
    private String yhteystiedot;
}
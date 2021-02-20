package com.sanvalero.springfarm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "animals")

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String species;
    @Column
    private String race;
    @Column
    private int weight;
    @Column
    private int age;
}

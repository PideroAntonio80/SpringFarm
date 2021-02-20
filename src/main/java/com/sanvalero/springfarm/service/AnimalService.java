package com.sanvalero.springfarm.service;

import com.sanvalero.springfarm.domain.Animal;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */
public interface AnimalService {

    Set<Animal> findAllAnimals();
    Set<Animal> findAllAnimals(String species);
}

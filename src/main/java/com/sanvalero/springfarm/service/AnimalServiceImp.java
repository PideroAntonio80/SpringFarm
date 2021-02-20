package com.sanvalero.springfarm.service;

import com.sanvalero.springfarm.domain.Animal;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */
@Service
public class AnimalServiceImp implements AnimalService {

    @Override
    public Set<Animal> findAllAnimals() {
        return null;
    }

    @Override
    public Set<Animal> findAllAnimals(String species) {
        return null;
    }
}

package com.sanvalero.springfarm.repository;

import com.sanvalero.springfarm.domain.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */
@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    Set<Animal> findAll();
    Animal findByName(String name);

}

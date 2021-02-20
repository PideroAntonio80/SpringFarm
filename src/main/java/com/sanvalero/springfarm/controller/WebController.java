package com.sanvalero.springfarm.controller;

import com.sanvalero.springfarm.domain.Animal;
import com.sanvalero.springfarm.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */

@Controller
public class WebController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/list")
    public String list(Model model) {

        Set<Animal> animals = animalService.findAllAnimals();
        model.addAttribute("animals", animals);
        // TODO Pintaré los productos en la web
        return "list";
    }

}

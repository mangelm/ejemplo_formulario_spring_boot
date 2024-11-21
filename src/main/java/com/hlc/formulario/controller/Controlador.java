package com.hlc.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

    @GetMapping("/saluda")
    public String greeting(
        @RequestParam(required = false, defaultValue = "World") String name,
        Model model) {

        // Añadir el atributo "name" al Model
        model.addAttribute("name", name);
        // Retorno del nombre de la vista (un archivo Thymeleaf llamado "saludo.html")
        return "saludo";
    }
}

package com.hlc.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hlc.formulario.model.Formulario;

@Controller
public class Controlador {

    @GetMapping("/formulario")
    public String showForm(Model model) {
        // Inicializamos el modelo del formulario
        model.addAttribute("formulario", new Formulario());

        // Lista de colores que se mostrarán en el select
        model.addAttribute("colores", new String[]{"Rojo", "Verde", "Azul"});
        return "formulario"; // La plantilla debe llamarse formulario.html
    }

    @PostMapping("/process")
    public String processForm(@ModelAttribute("formulario") Formulario formulario, Model model) {
        // Pasamos los datos enviados al modelo para mostrarlos en la vista de confirmación
        model.addAttribute("formulario", formulario);
        return "resultado"; // La plantilla debe llamarse resultado.html
    }
}

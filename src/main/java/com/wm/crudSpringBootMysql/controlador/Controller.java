package com.wm.crudSpringBootMysql.controlador;

import com.wm.crudSpringBootMysql.interfaceService.IPersonaService;
import com.wm.crudSpringBootMysql.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @Autowired
    IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personaList = service.listar();
        model.addAttribute("personas", personaList);
        return  "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Persona persona, Model model){
        service.save(persona);
        return "redirect:/listar";
    }
}

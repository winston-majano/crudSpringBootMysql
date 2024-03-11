package com.wm.crudSpringBootMysql.service;

import com.wm.crudSpringBootMysql.interfaceService.IPersonaService;
import com.wm.crudSpringBootMysql.interfaces.IPersona;
import com.wm.crudSpringBootMysql.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona persona) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}

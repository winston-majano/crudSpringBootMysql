package com.wm.crudSpringBootMysql.interfaceService;

import com.wm.crudSpringBootMysql.modelo.Persona;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona>listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona persona);
    public void delete(int id);

}

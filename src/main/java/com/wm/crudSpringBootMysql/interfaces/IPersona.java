package com.wm.crudSpringBootMysql.interfaces;

import com.wm.crudSpringBootMysql.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona extends CrudRepository<Persona, Integer> {


}

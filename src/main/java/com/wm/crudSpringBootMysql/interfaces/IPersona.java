package com.wm.crudSpringBootMysql.interfaces;

import com.wm.crudSpringBootMysql.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {


}

package com.wm.crudSpringBootMysql.modelo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephone;

    public Persona(int id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }


}

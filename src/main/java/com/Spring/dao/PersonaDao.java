package com.Spring.dao;


import org.springframework.data.repository.CrudRepository;

import com.Spring.Dominio.Persona;

public interface PersonaDao extends CrudRepository<Persona,Long>{

}

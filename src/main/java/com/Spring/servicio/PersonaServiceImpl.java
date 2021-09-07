package com.Spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Dominio.Persona;
import com.Spring.dao.PersonaDao;
@Service
public class PersonaServiceImpl  implements PersonaService{
@Autowired
private  PersonaDao personaDao;
	@Override
	
	public List<Persona> listarPersona() {
		
		
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public void guardar(Persona persona) {
		personaDao.save(persona);
		
	}

	@Override
	public void eliminar(Persona persona) {
		personaDao.delete(persona);
		
	}

	@Override
	public Persona encontrarpersona(Persona persona) {
		
		return personaDao.findById(persona.getIdPersona()).orElse(null);
	}

}

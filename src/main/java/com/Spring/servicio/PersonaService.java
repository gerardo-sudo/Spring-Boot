package com.Spring.servicio;

import java.util.List;

import com.Spring.Dominio.Persona;

public interface PersonaService {
	public List<Persona> listarPersona();
	public void guardar(Persona persona);
	public void eliminar(Persona persona);
	public Persona encontrarpersona(Persona persona);

}

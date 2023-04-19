package com.aljimez.T23C4.service;

import java.util.List;

import com.aljimez.T23C4.dto.Parties;

public interface IPartiesServcie {

	

	//Metodos del CRUD
	public List<Parties> listarParties(); //Listar All 
	
	public Parties guardarParties(Parties Parties);	//Guarda un Parties CREATE
	
	public Parties PartiesXID(Long id); //Leer datos de un Parties READ
	
	public Parties actualizarParties(Parties Parties); //Actualiza datos del Parties UPDATE
	
	public void eliminarParties(Long id);// Elimina el Parties DELETE
}

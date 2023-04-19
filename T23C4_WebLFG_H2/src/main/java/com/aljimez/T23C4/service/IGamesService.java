package com.aljimez.T23C4.service;

import java.util.List;

import com.aljimez.T23C4.dto.Games;

public interface IGamesService {
	public List<Games> listarGames(); //Listar All 
	
	public Games guardarGames(Games Games);	//Guarda un Games CREATE
	
	public Games GamesXID(Long id); //Leer datos de un Games READ
	
	public Games actualizarGames(Games Games); //Actualiza datos del Games UPDATE
	
	public void eliminarGames(Long id);// Elimina el Games DELETE
}

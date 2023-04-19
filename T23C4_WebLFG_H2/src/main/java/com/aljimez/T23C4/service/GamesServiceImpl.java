package com.aljimez.T23C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.T23C4.dao.IGamesDAO;
import com.aljimez.T23C4.dto.Games;

@Service
public   class GamesServiceImpl implements IGamesService{

	@Autowired
	IGamesDAO iGamesDAO;
	
	public List<Games> listarGames() {
		
		return iGamesDAO.findAll();
	}
	
	public Games guardarGames(Games Games) {
		
		return iGamesDAO.save(Games);
	}

	public Games GamesXID(Long id) {
		
		return iGamesDAO.findById(id).get();
	}

	public Games actualizarGames(Games Games) {
		
		return iGamesDAO.save(Games);
	}

	public void eliminarGames(Long id) {
		
		iGamesDAO.deleteById(id);
		
	}

	
	
	
}

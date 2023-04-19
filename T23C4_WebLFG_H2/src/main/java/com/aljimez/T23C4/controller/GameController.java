package com.aljimez.T23C4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T23C4.dto.Games;
import com.aljimez.T23C4.service.GamesServiceImpl;

public class GameController {

@RestController
@RequestMapping("/api")
public class GamesController {
	
	@Autowired
	GamesServiceImpl gamesServideImpl;
	
	@GetMapping("/games")
	public List<Games> listarGames(){
		return gamesServideImpl.listarGames();
	}
	
	@PostMapping("/games")
	public Games salvarGames(@RequestBody Games Games) {
		
		return gamesServideImpl.guardarGames(Games);
	}
	
	@GetMapping("/games/{id}")
	public Games GamesXID(@PathVariable(name="id") Long id) {
		
		Games Games_xid = new Games();
		
		Games_xid=gamesServideImpl.GamesXID(id);
		
		System.out.println("Games XID: "+Games_xid);
		
		return Games_xid;
	}
	
	
	@PutMapping("/games/{id}")
	public Games actualizarGames(@PathVariable(name="id")Long id,@RequestBody Games Games) {
		
		Games Games_seleccionado= new Games(id,Games.getnombre_Game(),Games.getDescripction(),Games.getPlaytime());
		Games Games_actualizado= new Games();
		
		Games_actualizado = gamesServideImpl.actualizarGames(Games_seleccionado);
		
		System.out.println("El Games actualizado es: "+ Games_actualizado);
		
		return Games_actualizado;
	}
	
	@DeleteMapping("/games/{id}")
	public void eleiminarGames(@PathVariable(name="id")Long id) {
		gamesServideImpl.eliminarGames(id);
	}
	
}}

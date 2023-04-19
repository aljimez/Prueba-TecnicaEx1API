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

import com.aljimez.T23C4.dto.Parties;
import com.aljimez.T23C4.service.PartiesServiceImpl;
@RequestMapping("/api")
public class PartiesController {

	@Autowired
	PartiesServiceImpl PartiesServideImpl;
	
	@GetMapping("/parties")
	public List<Parties> listarParties(){
		return PartiesServideImpl.listarParties();
	}
	
	@PostMapping("/parties")
	public Parties salvarParties(@RequestBody Parties Parties) {
		
		return PartiesServideImpl.guardarParties(Parties);
	}
	
	@GetMapping("/parties/{id}")
	public Parties PartiesXID(@PathVariable(name="id") Long id) {
		
		Parties Parties_xid = new Parties();
		
		Parties_xid=PartiesServideImpl.PartiesXID(id);
		
		System.out.println("Parties XID: "+Parties_xid);
		
		return Parties_xid;
	}
	
	@PutMapping("/parties/{id}")
	public Parties actualizarParties(@PathVariable(name="id")Long id,@RequestBody Parties Parties) {
		
		Parties Parties_seleccionado= new Parties();
		Parties Parties_actualizado= new Parties();
		
		Parties_seleccionado= PartiesServideImpl.PartiesXID(id);
		Parties_seleccionado.setNombre(Parties.getNombre());
		Parties_seleccionado.setDescription(Parties.getDescription());
		
		
		Parties_actualizado = PartiesServideImpl.actualizarParties(Parties_seleccionado);
		
		System.out.println("El Parties actualizado es: "+ Parties_actualizado);
		
		return Parties_actualizado;
	}
	
	@DeleteMapping("/parties/{id}")
	public void eleiminarParties(@PathVariable(name="id")Long id) {
		PartiesServideImpl.eliminarParties(id);
	}
}

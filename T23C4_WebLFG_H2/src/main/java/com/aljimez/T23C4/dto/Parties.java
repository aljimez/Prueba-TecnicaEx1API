package com.aljimez.T23C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "parties") // en caso que la tabla sea diferente
public class Parties {

	// Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre_par") // no hace falta si se llama igual
	private String nombre_par;
	
	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "id_parties")
	private Games game;

	@ManyToOne
	@JoinColumn(name = "party_host")
	private Users party_host;

	public Parties(Long id, String nombre_par, String description, Users party_host, Games game) {
		// super();
		this.id = id;
		this.nombre_par = nombre_par;
		this.description = description;
		this.game = game;
		this.party_host = party_host;
	}

	@Override
	public String toString() {
		return "Parties [id=" + id + ", nombre_par=" + nombre_par + ", description=" + description + ", game=" + game
				+ ", party_host=" + party_host + ", nombre=" + nombre + "]";
	}

	public String getName() {
		return nombre_par;
	}

	public void setName(String name) {
		this.nombre_par = nombre_par;
	}

	public Games getGame() {
		return game;
	}

	public void setGame(Games game) {
		this.game = game;
	}

	public Users getParty_host() {
		return party_host;
	}

	public void setParty_host(Users party_host) {
		this.party_host = party_host;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	// Constructores

	public Parties() {

	}

}

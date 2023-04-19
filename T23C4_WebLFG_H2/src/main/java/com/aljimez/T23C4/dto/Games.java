package com.aljimez.T23C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "games") // en caso que la tabla sea diferente
public class Games {
	// Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;

	@Column(name = "nombre-game") // no hace falta si se llama igual
	private String nombregame;

	@Column(name = "description")
	private String descripction;

	@Column(name = "playtime")
	private int playtime;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Parties> parties;

	public Games(Long id, String nombregame, String description, int playtime) {
		// super();
		this.id = id;
		this.nombregame = nombregame;
		this.descripction = description;
		this.playtime = playtime;

	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Parties")
	public List<Parties> getParty() {
		return parties;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripction() {
		return descripction;
	}

	public void setDescripction(String descripction) {
		this.descripction = descripction;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	@Override
	public String toString() {
		return "Games [id=" + id + ", descripction=" + descripction + ", playtime=" + playtime + ", nombre_Game="
				+ nombregame + "]";
	}

	public String getnombre_Game() {
		return nombregame;
	}

	public void setnombre_Game(String nombre_game) {
		this.nombregame = nombregame;
	}

	public Games() {

	}
}

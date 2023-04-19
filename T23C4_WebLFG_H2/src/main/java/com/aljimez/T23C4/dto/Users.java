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
@Table(name="users")//en caso que la tabla sea diferente
	//Atributos de entidad cliente
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "username")//no hace falta si se llama igual
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name ="email")
	private String email;

@OneToMany
@JoinColumn(name="id")
	private  List<Parties> parties;

public Users(Long id, String username,String password,String email) {
	//super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.email = email;
}
@JsonIgnore
@OneToMany(fetch = FetchType.LAZY, mappedBy = "parties")
public List<Parties> getParty() {
	return parties;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public List<Parties> getParties() {
	return parties;
}
public void setParties(List<Parties> parties) {
	this.parties = parties;
}

@Override
public String toString() {
	return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", parties="
			+ parties + "]";
}
public Users() {

}

}

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

import com.aljimez.T23C4.dto.Users;
import com.aljimez.T23C4.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserServiceImpl UserServiceImpl;

	@GetMapping("/users")
	public List<Users> listarUsers() {
		return UserServiceImpl.listarUsers();
	}

	@PostMapping("/users")
	public Users salvarUser(@RequestBody Users User) {

		return UserServiceImpl.guardarUsers(User);
	}

	@GetMapping("/users/{id}")
	public Users UserXID(@PathVariable(name = "id") Long id) {

		Users User_xid = new Users();

		User_xid = UserServiceImpl.UsersXID(id);

		System.out.println("User XID: " + User_xid);

		return User_xid;
	}

	@PutMapping("/users/{id}")
	public Users actualizarUser(@PathVariable(name = "id") Long id, @RequestBody Users User) {

		Users User_seleccionado = new Users(id, User.getUsername(), User.getPassword(), User.getEmail());

		Users User_actualizado = new Users();

		User_actualizado = UserServiceImpl.actualizarUser(User_seleccionado);

		System.out.println("El User actualizado es: " + User_actualizado);

		return User_actualizado;
	}

	@DeleteMapping("/users/{id}")
	public void eleiminarUser(@PathVariable(name = "id") Long id) {
		UserServiceImpl.eliminarUser(id);
	}

}

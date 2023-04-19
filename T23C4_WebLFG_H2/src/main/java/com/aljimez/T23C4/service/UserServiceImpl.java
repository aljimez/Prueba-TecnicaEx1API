package com.aljimez.T23C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aljimez.T23C4.dao.IUsersDAO;
import com.aljimez.T23C4.dto.Users;

public class UserServiceImpl implements IUsersService{
	@Autowired
IUsersDAO iUserDAO;
	public List<Users> listarUsers() {
		// TODO Auto-generated method stub
		return iUserDAO.findAll();
	}

	public Users guardarUsers(Users user) {
		// TODO Auto-generated method stub
		return iUserDAO.save(user);
	}

	public Users UsersXID(Long id) {
		// TODO Auto-generated method stub
		return  iUserDAO.findById(id).get();
	}

	public void eliminarUser(Long id) {
		// TODO Auto-generated method stub
		iUserDAO.deleteById(id);
	}

	public Users actualizarUser(Users user_seleccionado) {
		// TODO Auto-generated method stub
		return iUserDAO.save(user_seleccionado);
	}

}

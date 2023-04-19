package com.aljimez.T23C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T23C4.dao.IPartiesDAO;
import com.aljimez.T23C4.dto.Parties;
@Service
public  class PartiesServiceImpl  implements IPartiesServcie {

	//Utilizamos los metodos de la interface IPartiesDAO, es como si instaciaramos.
	@Autowired
	IPartiesDAO iPartiesDAO;
	
	public List<Parties> listarParties() {
		
		return iPartiesDAO.findAll();
	}

	public Parties guardarParties(Parties Parties) {
		
		return iPartiesDAO.save(Parties);
	}

	public Parties PartiesXID(Long id) {
		
		return iPartiesDAO.findById(id).get();
	}


	public Parties actualizarParties(Parties Parties) {
		
		return iPartiesDAO.save(Parties);
	}

	public void eliminarParties(Long id) {
		
		iPartiesDAO.deleteById(id);		
	}

	
}


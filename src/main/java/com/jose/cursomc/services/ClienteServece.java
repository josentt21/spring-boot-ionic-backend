package com.jose.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jose.cursomc.domain.Cliente;
import com.jose.cursomc.repositories.ClienteRepository;
import com.jose.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteServece {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objetonão encontrado! Id:" + id + ",Tipo:" + Cliente.class.getName()));
					
	}

}

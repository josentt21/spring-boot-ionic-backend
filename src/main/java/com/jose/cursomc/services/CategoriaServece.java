package com.jose.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jose.cursomc.domain.Categoria;
import com.jose.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaServece {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
			
	}

}

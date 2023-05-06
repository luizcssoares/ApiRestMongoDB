package com.example.apIRestMongo.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.example.apIRestMongo.model.Contato;

public interface ContatoService {
	public List<Contato> listarContatos(); 
	
	public void salvar(Contato contato);
	
	public Optional<Contato> buscar(BigInteger id);
	
	public void apagar(BigInteger id);
}
package com.example.apIRestMongo.serviceImpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apIRestMongo.model.Contato;
import com.example.apIRestMongo.respository.ContatoRepository;
import com.example.apIRestMongo.service.ContatoService;

@Service
public class ContatoServiceImpl implements ContatoService {
	@Autowired
	private ContatoRepository contatoRepository;
	
	public List<Contato> listarContatos(){
		return contatoRepository.findAll();
	}
	
	public void salvar (Contato contato) {
		contatoRepository.save(contato);
	}
	
	public Optional<Contato> buscar (BigInteger id) {
		return contatoRepository.findById(id);
	}
	
	public void apagar (BigInteger id) {
		contatoRepository.deleteById(id);
	}
}
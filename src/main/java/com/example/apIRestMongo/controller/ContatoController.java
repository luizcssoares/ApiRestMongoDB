package com.example.apIRestMongo.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.apIRestMongo.model.Contato;
import com.example.apIRestMongo.service.ContatoService;

@RestController
@RequestMapping(value="/api/contato")
public class ContatoController {
	
	@Autowired
	ContatoService contatoService;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)  
    public List<Contato> listarContatos() {						
		List<Contato> lista = contatoService.listarContatos();		
		return lista;		
    }
	
	@PostMapping(value="/salvar")
	public void salvarContato(@RequestBody Contato contato){
		contatoService.salvar(contato);
	}
	
	@RequestMapping(value="/buscar/{id}")
	public Optional<Contato> buscar(@PathVariable("id") BigInteger id) {
		return contatoService.buscar(id);
	}
	
	@DeleteMapping(value="/{id}")
	public void apagar(@PathVariable("id") BigInteger id) {
		contatoService.apagar(id);
	}
	
	

}

package com.example.apIRestMongo.respository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.apIRestMongo.model.Contato;

public interface ContatoRepository extends MongoRepository<Contato, BigInteger>{

	
}

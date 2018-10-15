package com.ewch.springboot.backend.apirest.model.service;

import java.util.List;

import com.ewch.springboot.backend.apirest.model.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);	

}

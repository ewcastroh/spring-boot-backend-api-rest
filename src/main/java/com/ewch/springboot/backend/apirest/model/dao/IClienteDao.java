package com.ewch.springboot.backend.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ewch.springboot.backend.apirest.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}

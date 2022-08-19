package com.idat.ServicioCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.ServicioCliente.Model.Cliente;


@RepositoryRestResource(path = "/cliente")
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

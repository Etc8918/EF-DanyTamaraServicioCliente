package com.idat.serviciocliente.serviciocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.serviciocliente.serviciocliente.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    
}

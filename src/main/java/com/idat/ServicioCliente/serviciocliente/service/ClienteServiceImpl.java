package com.idat.serviciocliente.serviciocliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.serviciocliente.serviciocliente.model.Cliente;
import com.idat.serviciocliente.serviciocliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository repository;
    @Override
    public List<Cliente> listar() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public void Registrar(Cliente cliente) {
        repository.save(cliente);
        
    }
    
}

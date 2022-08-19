package com.idat.serviciocliente.serviciocliente.service;

import java.util.List;

import com.idat.serviciocliente.serviciocliente.model.Cliente;

public interface ClienteService {
    public List<Cliente> listar();
    public void Registrar(Cliente cliente);
}

package com.idat.serviciocliente.serviciocliente.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.serviciocliente.serviciocliente.model.Cliente;
import com.idat.serviciocliente.serviciocliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<?> listar(){
        List<Cliente> listado = service.listar();
        return ResponseEntity.ok(listado);
    }

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Cliente cliente){
        try {
            service.Registrar(cliente);
            return ResponseEntity.ok().body("Guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
    
}

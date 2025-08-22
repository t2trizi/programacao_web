package com.prog.fatec.api_fatec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prog.fatec.api_fatec.entities.Cliente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final List<Cliente> listaCliente = new ArrayList<>(); //list<classe> nome = new instancia do tipo array
    
    @GetMapping("/testeCliente1") //-> /api/clientes/testeCliente1
    public String testeCliente() {
        return "Teste Client";
    }

    @GetMapping("/testeCliente2/{nome}") //-> /api/clientes/testeCliente2/
    public String testeCliente2(@PathVariable String nome) {
        return nome;
    }

    @PostMapping("")
    public String createCliente(@RequestBody Cliente cliente) {
        return cliente.getNome();
    }
    
}
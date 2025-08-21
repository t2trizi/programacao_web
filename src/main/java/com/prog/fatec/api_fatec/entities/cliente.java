package com.prog.fatec.api_fatec.entities;

public class cliente {
    private Long id;
   
    private String nome;
 
    public cliente() {
       
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
}
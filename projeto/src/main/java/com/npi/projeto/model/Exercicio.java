package com.npi.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exercicio")

public class Exercicio {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private int rep;
    
    private int kg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getrep() {
        return rep;
    }

    public void setrep(int rep) {
        this.rep = rep;
    }

    public int getkg() {
        return kg;
    }

    public void setkg(int kg) {
        this.kg = kg;
    }
    
}

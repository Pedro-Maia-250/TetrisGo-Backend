package com.lunarvoid.LetrisGo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "palavra-vazia-tb")
public class PalavraVazia {
    
    private Integer posição;

    protected PalavraVazia(){}

    public PalavraVazia(Integer posição) {
        this.posição = posição;
    }

    public Integer getPosição() {
        return posição;
    }

    public void setPosição(Integer posição) {
        this.posição = posição;
    }
    
    
}

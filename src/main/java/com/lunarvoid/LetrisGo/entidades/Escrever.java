package com.lunarvoid.LetrisGo.entidades;

import java.util.List;

import com.lunarvoid.LetrisGo.entidades.abstracts.Exercicio;

public class Escrever extends Exercicio {
    
    private List<Palavra> sequencia;

    public Escrever(Long id, List<Palavra> resposta, List<Palavra> sequencia) {
        super(id, resposta);
        this.sequencia = sequencia;
    }

    public List<Palavra> getSequencia() {
        return sequencia;
    }

    public void setSequencia(List<Palavra> sequencia) {
        this.sequencia = sequencia;
    }
}

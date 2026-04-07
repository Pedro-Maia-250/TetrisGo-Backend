package com.lunarvoid.LetrisGo.entidades;

import java.util.List;

import com.lunarvoid.LetrisGo.entidades.abstracts.Exercicio;

public class Tetris extends Exercicio {
    
    private List<List<Palavra>> sequencia;

    public Tetris(Long id, List<Palavra> resposta, List<List<Palavra>> sequencia) {
        super(id, resposta);
        this.sequencia = sequencia;
    }

    public List<List<Palavra>> getSequencia() {
        return sequencia;
    }

    public void setSequencia(List<List<Palavra>> sequencia) {
        this.sequencia = sequencia;
    }
    
}

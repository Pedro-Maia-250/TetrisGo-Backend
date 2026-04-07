package com.lunarvoid.LetrisGo.entidades;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lunarvoid.LetrisGo.entidades.abstracts.Exercicio;

public class Completar extends Exercicio {

    private Set<PalavraVazia> palavrasVazias = new HashSet<>();

    public Completar(Long id, List<Palavra> resposta, Set<PalavraVazia> palavrasVazias) {
        super(id, resposta);
        this.palavrasVazias = palavrasVazias;
    }

    public Set<PalavraVazia> getPalavrasVazias() {
        return palavrasVazias;
    }

    public void setPalavrasVazias(Set<PalavraVazia> palavrasVazias) {
        this.palavrasVazias = palavrasVazias;
    }

}

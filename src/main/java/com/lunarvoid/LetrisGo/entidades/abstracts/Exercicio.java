package com.lunarvoid.LetrisGo.entidades.abstracts;

import java.util.ArrayList;
import java.util.List;

import com.lunarvoid.LetrisGo.entidades.Palavra;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Exercicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<Palavra> resposta = new ArrayList<>();

    public Exercicio(Long id, List<Palavra> resposta) {
        this.id = id;
        this.resposta = resposta;
    }

    public Long getId() {
        return id;
    }

    public List<Palavra> getResposta() {
        return resposta;
    }

    public boolean corrigir(List<Palavra> resposta){
        if (this.resposta.size() == resposta.size()) {
            if(this.resposta.equals(resposta)){
                return true;
            }else{
                return false;
            }
        }else{
            throw new IllegalArgumentException("Quantidade de palavras na resposta errada");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Exercicio other = (Exercicio) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}

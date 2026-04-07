package com.lunarvoid.LetrisGo.entidades;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atividade-tb")
public class AtividadeDiaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant data;
    private Completar exerciciDeCompletar;
    private Tetris exerciciDeLetriz;
    private Escrever exercicioDeEscrever;
    
    public AtividadeDiaria(Long id, Instant data, Completar exerciciDeCompletar, Tetris exerciciDeLetriz, Escrever exercicioDeEscrever) {
        this.id = id;
        this.data = data;
        this.exerciciDeCompletar = exerciciDeCompletar;
        this.exerciciDeLetriz = exerciciDeLetriz;
        this.exercicioDeEscrever = exercicioDeEscrever;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public Completar getExerciciDeCompletar() {
        return exerciciDeCompletar;
    }

    public void setExerciciDeCompletar(Completar exerciciDeCompletar) {
        this.exerciciDeCompletar = exerciciDeCompletar;
    }

    public Tetris getExerciciDeLetriz() {
        return exerciciDeLetriz;
    }

    public void setExerciciDeLetriz(Tetris exerciciDeLetriz) {
        this.exerciciDeLetriz = exerciciDeLetriz;
    }

    public Escrever getExercicioDeEscrever() {
        return exercicioDeEscrever;
    }

    public void setExercicioDeEscrever(Escrever exercicioDeEscrever) {
        this.exercicioDeEscrever = exercicioDeEscrever;
    }

    public Long getId() {
        return id;
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
        AtividadeDiaria other = (AtividadeDiaria) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}

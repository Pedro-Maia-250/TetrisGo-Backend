package com.lunarvoid.LetrisGo.entidades;

import java.util.Collection;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lunarvoid.LetrisGo.entidades.enums.Acesso;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario implements UserDetails {
    
    @Id
    private String email;
    
    @NotBlank
    private String senha;

    @NotNull
    private Integer Acesso;

    private Long ofensiva = 0L;

    protected Usuario(){}

    public Usuario(String email, @NotBlank String senha, @NotNull Acesso acesso, Long ofensiva) {
        this.email = email;
        this.senha = senha;
        this.Acesso = acesso.getCode();
        this.ofensiva = ofensiva;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getAcesso() {
        return Acesso;
    }

    public void setAcesso(Integer acesso) {
        Acesso = acesso;
    }

    public Long getOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(Long ofensiva) {
        this.ofensiva = ofensiva;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public @Nullable String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

}

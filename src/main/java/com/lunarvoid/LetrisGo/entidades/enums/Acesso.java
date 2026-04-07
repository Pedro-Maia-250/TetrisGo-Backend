package com.lunarvoid.LetrisGo.entidades.enums;

public enum Acesso {
    USER(0),
    PROF(1),
    ADM(2);

    private Integer code;

    private Acesso(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return this.code;
    }

    public static Acesso valueOf(Integer code){
        for (Acesso e : Acesso.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }

        throw new IllegalArgumentException("Codigo de Acesso invalido");
    }
}

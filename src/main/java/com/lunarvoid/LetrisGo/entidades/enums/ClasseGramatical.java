package com.lunarvoid.LetrisGo.entidades.enums;

public enum ClasseGramatical {
    SUBSTANTIVO(0),
    VARBO(1),
    ADJETIVO(2),
    PRONOME(3),
    ARTIGO(4),
    NUMERAL(5),
    ADVÉRBIO(6),
    PREPOCIÇÃO(7),
    CONJUNÇÃO(8),
    INTERJEIÇÃO(9);

    private Integer code;

    private ClasseGramatical(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return this.code;
    }

    public static ClasseGramatical valueOf(Integer code){
        for (ClasseGramatical e : ClasseGramatical.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }

        throw new IllegalArgumentException("Codigo de ClasseGramatical invalido");
    }
}

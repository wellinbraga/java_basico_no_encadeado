package com.projetono.No;

public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo +
                '}';
    }
}

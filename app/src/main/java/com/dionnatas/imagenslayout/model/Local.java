package com.dionnatas.imagenslayout.model;

public class Local {

    private final String local;
    private final String imagem;
    private final String descricao;

    public Local(String local, String imagem, String descricao){
        this.local = local;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }
}

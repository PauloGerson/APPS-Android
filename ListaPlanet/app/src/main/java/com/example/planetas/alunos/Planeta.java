package com.example.planetas.alunos;

public class Planeta {

    int imageId;
    String descricao;
    String nome_planeta;

    public Planeta(String nomePlaneta,int imageId, String descricao) {
        this.imageId = imageId;
        this.descricao = descricao;
        this.nome_planeta = nomePlaneta;
    }

    public Planeta() {

    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome_planeta() {
        return nome_planeta;
    }

    public void setNome_planeta(String nome_planeta) {
        this.nome_planeta = nome_planeta;
    }
}

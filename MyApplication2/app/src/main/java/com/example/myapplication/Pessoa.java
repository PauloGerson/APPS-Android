package com.example.myapplication;

public class Pessoa {
    private String nome;
    private String idade;
    private String descricao;

    public Pessoa(String nome, String idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

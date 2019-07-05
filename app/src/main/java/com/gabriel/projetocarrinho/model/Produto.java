package com.gabriel.projetocarrinho.model;

/**
 * Created by gabriel on 05/07/19.
 */

public class Produto {

    private int id;
    private String nome;
    private Double preco;

    public Produto(){}

    public Produto(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "**Produto**\nid: " + getId() + "\nNome: " + getNome() + "\nPreco: " + getPreco() + "\n";
    }
}

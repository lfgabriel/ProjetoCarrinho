package com.gabriel.projetocarrinho.model;

import com.gabriel.projetocarrinho.model.Produto;

/**
 * Created by gabriel on 05/07/19.
 */

public class ProdutoCarrinho {

    Produto produto;
    int quantidade;
    private Double preco;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n**ProdutoCarrinho**\nProduto: " + getProduto().getNome() + "\nQuantidade: " + getQuantidade() + "\nPreco total: " + getPreco();
    }
}

package com.gabriel.projetocarrinho.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 05/07/19.
 */

public class Carrinho {

    private List<ProdutoCarrinho> produtos;
    private Double valor;

    public Carrinho() {
        produtos = new ArrayList<>();
        valor = 0.0;
    }

    public List<ProdutoCarrinho> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoCarrinho> produtos) {
        this.produtos = produtos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void addProduto(ProdutoCarrinho produtoCarrinho) {
        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).getProduto().getId() == produtoCarrinho.getProduto().getId()) {
                produtos.get(i).setQuantidade(produtos.get(i).getQuantidade() + produtoCarrinho.getQuantidade());
                valor += produtoCarrinho.getPreco();
                return;
            }
        }
        produtos.add(produtoCarrinho);
        valor += produtoCarrinho.getPreco();
    }

    @Override
    public String toString() {
        if (produtos.isEmpty())
            return "Carrinho vazio";
            else
                return "**Carrinho**\nValor total: " + getValor() + "\nProdutos: " + getProdutos().toString();
    }
}

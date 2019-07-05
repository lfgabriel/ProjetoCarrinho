package com.gabriel.projetocarrinho;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gabriel.projetocarrinho.model.Produto;

import java.util.List;

/**
 * Created by gabriel on 05/07/19.
 */

public class ProdutoAdapter extends RecyclerView.Adapter {

    private List<Produto> produtos;
    private final Context context;


    public ProdutoAdapter(Context context, List<Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate( R.layout.produto_adapter, parent, false);

        ProdutoAdapter.ProdutoViewHolder holder = new ProdutoViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ProdutoViewHolder holder = (ProdutoViewHolder) viewHolder;
        Produto produto  = produtos.get(position);

        holder.produtoId.setText("Id: " + String.valueOf(produto.getId()));
        holder.produtoNome.setText("Nome: " + produto.getNome());
        holder.produtoPreco.setText("Preço:" + String.valueOf(produto.getPreco()));
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }


    public class ProdutoViewHolder extends RecyclerView.ViewHolder {

        private TextView produtoId;
        private TextView produtoNome;
        private TextView produtoPreco;


        public ProdutoViewHolder(View view) {
            super(view);

            produtoId = (TextView) view.findViewById(R.id.tv_produto_adapter_id);
            produtoNome = (TextView) view.findViewById(R.id.tv_produto_adapter_nome);
            produtoPreco = (TextView) view.findViewById(R.id.tv_produto_adapter_preco);

        }
    }
}

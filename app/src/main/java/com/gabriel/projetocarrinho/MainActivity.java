package com.gabriel.projetocarrinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gabriel.projetocarrinho.model.Carrinho;
import com.gabriel.projetocarrinho.model.Produto;
import com.gabriel.projetocarrinho.model.ProdutoCarrinho;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static Carrinho carrinho = new Carrinho();
    public static List<Produto> cardapio = new ArrayList<>();

    RecyclerView cardapioRecyclerView;
    ProdutoAdapter produtoAdapter;

    EditText quantidadeEditText;
    EditText produtoIdEditText;
    Button addProdutoButton;

    TextView carrinhoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardapioRecyclerView = (RecyclerView) findViewById(R.id.rv_cardapio);
        quantidadeEditText = (EditText) findViewById(R.id.et_quantidade);
        produtoIdEditText = (EditText) findViewById(R.id.et_produto);
        addProdutoButton = (Button) findViewById(R.id.bt_adicionar_produto);
        carrinhoTextView = (TextView) findViewById(R.id.tv_carrinho);

        criaCardapio();
        //Log.e("Main", cardapio.toString());
        carregaRecyclerView();
    }

    private void criaCardapio() {
        if (cardapio.isEmpty())  {
            for (int i = 0; i < 10; i++) {
                Produto produto = new Produto(i, "Pizza" + String.valueOf(i), Double.valueOf(i));
                cardapio.add(produto);
            }
        }
    }

    public void adicionarProdutoAoCarrinho(View view) {
        //IMPLEMENTAR

    }

    private void carregaRecyclerView() {
        produtoAdapter = new ProdutoAdapter(this, cardapio);
        cardapioRecyclerView.setAdapter(produtoAdapter);
        RecyclerView.LayoutManager layoutManager  = new LinearLayoutManager(this);
        cardapioRecyclerView.setLayoutManager(layoutManager);
    }
}

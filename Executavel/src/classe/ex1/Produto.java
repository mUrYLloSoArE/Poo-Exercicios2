package classe.ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Produto {

    List<Produto> produtos = new ArrayList<>();
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void addProduto();
    public abstract void infoItem();

    @Override
    public String toString() {
        return  "Nome do produto: " + getNome() + " Preço do produto: " + getPreco();
    }
}

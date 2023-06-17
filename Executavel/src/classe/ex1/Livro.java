package classe.ex1;

import java.util.Scanner;

public class Livro extends Produto {
     private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void addProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Livro");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do Livro ");
        double preco = sc.nextDouble();

        System.out.println("Digite o nome do autor ");
        String autor =sc.next();

        Produto livro = new Livro(nome,preco,autor);
        produtos.add(livro);
    }
    @Override
    public void infoItem() {
        for (Produto dvds:produtos) {
            System.out.println(dvds);
        }
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return  "Nome do livro: " + getNome() + " Preço do livro: " + getPreco()
                + " Autor do livro -> " + getAutor() ;
    }


}

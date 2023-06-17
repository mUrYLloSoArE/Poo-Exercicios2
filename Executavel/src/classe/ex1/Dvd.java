package classe.ex1;

import java.util.Scanner;

public class Dvd extends  Produto{

    private int duracao;

    public Dvd(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public void addProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Dvd");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do Dvd ");
        double preco = sc.nextDouble();

        System.out.println("Digite a duração ");
        int duracao =sc.nextInt();

        Produto dvd = new Dvd(nome,preco,duracao);
        produtos.add(dvd);
    }
    @Override
    public void infoItem() {
        for (Produto dvds:produtos) {
            System.out.println(dvds);
        }
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return  "Nome do Dvd: " + getNome() + " Preço do Dvd: " + getPreco()
                + " Duração " + getDuracao() + " horas " ;
    }

}

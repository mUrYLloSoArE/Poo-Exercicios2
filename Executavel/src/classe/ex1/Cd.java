package classe.ex1;

import java.util.Scanner;

public class Cd extends Produto{

    private int nFaixas;

    public Cd(String nome, double preco, int nFaixas) {
        super(nome, preco);
        this.nFaixas = nFaixas;
    }
    @Override
    public void addProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Cd");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do Cd ");
        double preco = sc.nextDouble();

        System.out.println("Digite o número de faixas ");
        int nFaixas =sc.nextInt();

        Produto cd = new Cd(nome,preco,nFaixas);
        produtos.add(cd);


    }
    @Override
    public void infoItem() {
        for (Produto cds:produtos) {
            System.out.println(cds);
        }
    }

    public int getnFaixas() {
        return nFaixas;
    }

    @Override
    public String toString() {
        return  "Nome do Cd: " + getNome() + " Preço do Cd: " + getPreco()
                + " Nº de faixas: " + getnFaixas() ;
    }


}

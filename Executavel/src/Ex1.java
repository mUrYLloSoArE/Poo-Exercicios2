import classe.ex1.Cd;
import classe.ex1.Dvd;
import classe.ex1.Livro;
import classe.ex1.Produto;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produto cd = new Cd();
        Produto dvd = new Dvd();
        Produto livro = new Livro();

        boolean rodando=true;
        int limite = 0;
        int opcao;

        System.out.println("Adicione 5 produtos ao carrinho");
        while (rodando){

            System.out.println("Digite as opções a seguir : ");
            System.out.println("1- Adicionar Cd, 2 - Adicionar Dvd, 3- Adicionar livro ");
            System.out.println("4- Detalhes dos Cds, 5 - Detalhes dos Dvds, 6 - Detalhes dos livros,");
            opcao=sc.nextInt();

            switch (opcao){

                    case 1:
                    cd.addProduto();
                    limite++;
                    break;

                    case 2:
                    dvd.addProduto();
                    limite++;
                    break;

                    case 3:
                    livro.addProduto();
                    limite++;
                    break;

                    case 4:
                    cd.infoItem();
                    break;

                    case 5:
                    dvd.infoItem();
                    break;

                    case 6:
                    livro.infoItem();
                    break;

                    default:
                    System.out.println("Opção inválida digite novamente! ");
                    System.exit(0);
            }

             if (limite == 5){
                System.out.println("Lista dos produtos adicionados : ");
                cd.infoItem(); dvd.infoItem(); livro.infoItem();
                System.exit(0);
            }

        }
        sc.close();
    }
}

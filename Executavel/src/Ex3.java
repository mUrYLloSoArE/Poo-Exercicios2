import classes.ex3.Fluorescente;
import classes.ex3.Incandescente;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        Fluorescente fluorescente = new Fluorescente();
        Incandescente incandescente = new Incandescente();

        String lampada,tipo,opcao;
        boolean condicao = true;

        do {
            System.out.println("Digite qual lampada quer construir");

            System.out.println("F- fluorescente I- incandescente  S-sair");
            lampada = sc.next();

            if (lampada.equalsIgnoreCase("F")){

                System.out.println("Digite o tipo da lampada fluorescente ");
                tipo= sc.next();
                System.out.println(fluorescente.construir(tipo));

                System.out.println(" L - ligar ou D - desligar a lampada?");
                opcao=sc.next();

                if (opcao.equalsIgnoreCase("l")){
                    fluorescente.ligar();
                }else {
                    fluorescente.desligar();
                }

            }else if (lampada.equalsIgnoreCase("I")){
                System.out.println("Digite o tipo da lampada incandescente ");
                tipo= sc.next();
                System.out.println(incandescente.construir(tipo));

                System.out.println(" L - ligar ou D - desligar a lampada?");
                opcao=sc.next();

                if (opcao.equalsIgnoreCase("l")){
                    incandescente.ligar();
                }else {
                    incandescente.desligar();
                }

            }else {
                System.out.println("Fábrica fechada! ");
                condicao=false;
            }

        }while (condicao);

        sc.close();

        }
    }

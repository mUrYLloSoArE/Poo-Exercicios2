import classe.ex4.Corrente;
import classe.ex4.Poupanca;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        Corrente corrente = new Corrente(2500,"Muryllo Soares",2123456);
        Poupanca poupanca = new Poupanca(2000,"Muryllo Soares",21234567);


        poupanca.deposito(500);
        corrente.deposito(500);

        poupanca.infoContaPoupanca();
        corrente.infoContaCorrente();

        poupanca.saque(1000);
        poupanca.infoContaPoupanca();

        corrente.saque(1000);
        corrente.infoContaCorrente();

        sc.close();

        }
    }

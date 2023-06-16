package classes.ex3;

import java.util.Scanner;

public class Fluorescente extends FabricaLampada implements Lampada{

    public boolean ligar() {
        System.out.println(" Iluminando!");
        return true;
    }

    public boolean desligar() {
        System.out.println(" apagando! ");
        return false;
    }


    public String construir(String tipo) {
        Scanner sc = new Scanner(System.in);
        double potencia;

        System.out.println("Digite a potencia da lampada");
        potencia=sc.nextDouble();

        return "Lampada Fluorescente " + tipo + " potencia " + potencia + " Watts ";
    }
}

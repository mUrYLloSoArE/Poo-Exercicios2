package classes.ex3;

import java.util.Scanner;

public class Incandescente extends FabricaLampada implements Lampada{

    public boolean ligar() {
        System.out.println("Lampada acesa!");
        return true;
    }

    public boolean desligar() {
        System.out.println("Lampada apagada! ");
        return false;
    }


    public String construir(String tipo) {
        Scanner sc = new Scanner(System.in);
        double potencia;

        System.out.println("Digite a potencia da lampada");
        potencia=sc.nextDouble();

        return "Lampada Incandescente " + tipo + " potencia " + potencia + " Watts ";

    }

}

import classe.ex2.Circulo;
import classe.ex2.Forma;
import classe.ex2.Quadrado;
import classe.ex2.Retangulo;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        Quadrado quadrado= new Quadrado();
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();

        double lado, altura,raio;

        System.out.println("Ex2 aplicado com conceitos de classe e métodos abstratos, junto com herança e polimorfismo");

        System.out.println("Digite o valor do lado");
        lado = sc.nextDouble();

        System.out.println("Digite o valor do altura");
        altura = sc.nextDouble();

        System.out.println("Digite o valor do raio");
        raio = sc.nextDouble();

        System.out.println("A área do quadrado é : ");
        System.out.println(quadrado.area(lado) + " cm ");

        System.out.println("O perimetro do quadrado é : ");
        System.out.println(quadrado.perimetro(lado)+ " cm ");

        System.out.println("A área do retangulo é : ");
        System.out.println(retangulo.area(lado,altura) + " cm ");

        System.out.println("O perimetro do retangulo é : ");
        System.out.println(retangulo.perimetro(lado,altura)+ " cm ");

        System.out.println("A área do circulo é : ");
        System.out.println(Math.round(circulo.area(raio)) + " cm de" + " diametro ");

        System.out.println("O perimetro do circulo é : ");
        System.out.println(Math.round(circulo.perimetro(raio)) + " cm de" +  " diametro ");



        sc.close();

        }
    }

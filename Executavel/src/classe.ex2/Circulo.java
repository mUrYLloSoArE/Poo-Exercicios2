package classe.ex2;

public class Circulo extends Forma {


    public double area(double raio) {
        calculo=3.14*(raio*raio);
        return calculo;
    }

    public double perimetro(double raio) {
        calculo=2*3.14*raio;
        return calculo;
    }

}

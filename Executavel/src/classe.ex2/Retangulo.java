package classe.ex2;

public class Retangulo extends Quadrado{
    public double area(double base,double altura) {
        calculo = base*altura;
        return calculo;
    }

    public double perimetro(double base,double altura) {
        calculo= 2*(base+altura);
        return calculo;
    }
}

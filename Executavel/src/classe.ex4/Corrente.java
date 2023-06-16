package classe.ex4;

public class Corrente extends Conta implements tributavel {

    public Corrente(double saldo, String titular, int numeroConta) {
        super(saldo, titular, numeroConta);
    }

double tributavel=0.1;
double tributos= saldo*tributavel;
double seguroDeVida=42.00;
double total=tributos+seguroDeVida;
double calculo= saldo- tributos - seguroDeVida;

    public void infoContaCorrente(){
        System.out.println("Informações conta corrente: ");
        System.out.println("Nome do titular -> " + titular);
        System.out.println("Número da Conta -> " + numeroConta);
        System.out.println("Tributos a pagar junto com o seguro de vida -> " + total);
        System.out.println("Saldo da Conta Corrente ->" + calculo);
    }

}

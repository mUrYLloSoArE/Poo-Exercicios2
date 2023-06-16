package classe.ex4;

public class Poupanca  extends Conta{

    public Poupanca(double saldo, String titular, int numeroConta) {
        super(saldo, titular, numeroConta);
    }
    double taxa=0.03;
    double saldoAtual=saldo+(saldo*taxa);



    public void infoContaPoupanca(){
        System.out.println();
        System.out.println("Informações conta poupança: ");
        System.out.println("Nome do titular -> " + titular);
        System.out.println("Número da Conta -> " + numeroConta);
        System.out.println("Saldo da Conta Poupança ->" + saldoAtual);
        System.out.println();
    }

}

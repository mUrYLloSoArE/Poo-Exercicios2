package classe.ex4;

public class Conta {
    public double saldo;
    public String titular;
    public int numeroConta;

    public Conta(double saldo, String titular, int numeroConta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void deposito(int qtd){
        saldo+=qtd;
    }
    public void saque(int qtd){
        saldo-=qtd;
    }

}

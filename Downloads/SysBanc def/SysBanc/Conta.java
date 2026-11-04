package SysBanc;

public abstract class Conta {
    protected double Saldo;

    public void depositar(double valor) {
        this.Saldo += valor;
    }

    public void sacar(double valor) {
        this.Saldo -= valor;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
}

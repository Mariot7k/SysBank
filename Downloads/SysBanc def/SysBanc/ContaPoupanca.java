package SysBanc;

public class ContaPoupanca extends Conta {
    private int diaAniversario;

    public ContaPoupanca(double saldo, int diaAniversario) {
        this.Saldo = saldo;
        this.diaAniversario = diaAniversario;
    }
}

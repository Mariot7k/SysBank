package SysBanc;

public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(double saldo, double limiteCredito) {
        this.Saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (this.Saldo + this.limiteCredito)) {
            this.Saldo -= valor;
            System.out.println("Valor de R$" + valor + " sacado da conta com êxito!\nSaldo atual: R$" + Saldo);
        } else {
            System.out.println("Saldo insuficiente para esta operação!\nSaldo atual: R$" + Saldo);
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor > 0 && (this.Saldo - valor) >= -this.limiteCredito) {
            this.Saldo -= valor;
            System.out.println("Cheque especial utilizado!\nSaldo atual: R$" + Saldo);
        } else {
            System.out.println("Limite insuficiente!\nSaldo atual: R$" + Saldo);
        }
    }
}

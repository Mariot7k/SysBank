package SysBanc;

public class SistemaBancario {

    public static void exibirStatusConta(Conta contaGenerica) {
        System.out.println("\n--- Status da Conta ---");
        System.out.println("Tipo: "
                + contaGenerica.getClass().getSimpleName());
        System.out.println("Saldo Atual: R$"
                + contaGenerica.getSaldo());
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(800.00, 200.00);
        ContaPoupanca cp = new ContaPoupanca(1500.00, 5);

        Cliente clienteCC = new Cliente("Maria Silva", cc);

        System.out.println("Teste de Herança e Sobrescrita ");

        cc.sacar(100.00);
        cc.sacar(1000.00);

        cp.depositar(500.00);

        System.out.println("\n--- Teste de Princípio LSP ---");

        exibirStatusConta(cc);
        exibirStatusConta(cp);

        System.out.println(
                "O sistema tratou as classes especializadas de forma uniforme."
        );
    }
}

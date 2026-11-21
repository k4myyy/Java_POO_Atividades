package q03;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("[CP - %s] Saque de R$ %.2f (sem taxa). Saldo atual: R$ %.2f%n",
                    titular, valor, saldo);
        } else {
            System.out.printf("[CP - %s] Saldo insuficiente para sacar R$ %.2f.%n", titular, valor);
        }
    }
}

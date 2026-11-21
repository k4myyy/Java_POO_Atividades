package q03;

public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 2.00;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (valor > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.printf("[CC - %s] Saque de R$ %.2f (+ R$ 2,00 taxa). Saldo atual: R$ %.2f%n",
                    titular, valor, saldo);
        } else {
            System.out.printf("[CC - %s] Saldo insuficiente para sacar R$ %.2f (com taxa).%n", titular, valor);
        }
    }
}

package q10;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser maior que zero.");
        }
        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino não pode ser nula.");
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(
                String.format("Saldo insuficiente na conta %s (Saldo: R$ %.2f, Tentativa: R$ %.2f).",
                    this.numero, this.saldo, valor)
            );
        }

        this.saldo -= valor;
        destino.saldo += valor;
        System.out.printf("Transferência de R$ %.2f da conta %s para %s concluída!%n",
                valor, this.numero, destino.numero);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}

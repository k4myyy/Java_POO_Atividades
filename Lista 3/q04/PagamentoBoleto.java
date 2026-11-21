package q04;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f. Aguardando compensação bancária.%n", valor);
    }
}

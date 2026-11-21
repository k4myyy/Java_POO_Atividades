package q04;

public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f processado instantaneamente via PIX.%n", valor);
    }
}

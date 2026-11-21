package q04;

public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f aprovado no Cartão de Crédito.%n", valor);
    }
}

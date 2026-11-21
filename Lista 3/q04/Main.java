package q04;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new PagamentoPix(),
            new PagamentoCartao(),
            new PagamentoBoleto()
        };

        double[] valores = {150.00, 320.50, 89.90};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
        }
    }
}

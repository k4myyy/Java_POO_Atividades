package q11;

public class Main {
    public static void main(String[] args) {
        try {
            Produto p1 = new ProdutoFisico("Livro Físico Java", 80.00);
            Produto p2 = new ProdutoDigital("Curso Online POO", 120.00);
            Produto p3 = new ProdutoFisico("Headset", 200.00);

            Produto[] pedidos = {p1, p2, p3};

            System.out.println("=== Resumo do Pedido ===");
            for (Produto p : pedidos) {
                System.out.printf("Produto: %-20s | Preço Final: R$ %.2f%n", p.getNome(), p.calcularPrecoFinal());
            }

            System.out.println("\n=== Aplicando Desconto no Produto Digital ===");
            if (p2 instanceof Descontavel) {
                Descontavel digitalDescontavel = (Descontavel) p2;
                double comDesconto = digitalDescontavel.aplicarDesconto(20.0); // 20% de desconto
                System.out.printf("%s com 20%% de desconto: R$ %.2f%n", p2.getNome(), comDesconto);
            }

            System.out.println("\n=== Testando Cadastro com Preço Inválido ===");
            Produto invalido = new ProdutoDigital("E-book Grátis Inválido", 0.0);
            System.out.println(invalido.getNome());

        } catch (PrecoInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}

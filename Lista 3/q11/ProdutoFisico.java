package q11;

public class ProdutoFisico extends Produto {
    private static final double TAXA_ENTREGA = 15.00;

    public ProdutoFisico(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + TAXA_ENTREGA;
    }
}

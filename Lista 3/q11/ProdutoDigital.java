package q11;

public class ProdutoDigital extends Produto implements Descontavel {

    public ProdutoDigital(String nome, double precoBase) throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }

    @Override
    public double aplicarDesconto(double percentual) {
        double precoAtual = calcularPrecoFinal();
        return precoAtual - (precoAtual * (percentual / 100.0));
    }
}

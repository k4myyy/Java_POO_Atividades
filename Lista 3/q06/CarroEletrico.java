package q06;

public class CarroEletrico extends Veiculo implements Eletrico {
    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 15;
        System.out.println(modelo + " (Elétrico) acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria do " + modelo + "...");
    }
}

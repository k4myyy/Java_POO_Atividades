package q06;

public class Main {
    public static void main(String[] args) {
        Carro carroComum = new Carro("Sedan 1.6");
        CarroEletrico carroEletrico = new CarroEletrico("BYD Seal");

        carroComum.acelerar();
        carroComum.acelerar();

        System.out.println("---");

        carroEletrico.carregarBateria();
        carroEletrico.acelerar();
        carroEletrico.acelerar();
    }
}

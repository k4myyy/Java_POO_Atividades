package q05;

public class Computador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Computador iniciando sistema operacional...");
    }

    @Override
    public void desligar() {
        System.out.println("Computador encerrando sistema...");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Computador conectado à internet.");
    }
}

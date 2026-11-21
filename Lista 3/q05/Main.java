package q05;

public class Main {
    public static void main(String[] args) {
     
        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador pc = new Computador();

        tv.ligar();
        tv.desligar();

        System.out.println("---");

        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println("---");

        pc.ligar();
        pc.conectarInternet();
        pc.desligar();
    }
}

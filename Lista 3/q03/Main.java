package q03;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("Mariana", 500.00);
        ContaBancaria cp = new ContaPoupanca("João", 500.00);

        cc.depositar(200.00);
        cc.sacar(100.00);

        System.out.println("--------------------------------------------------");

        cp.depositar(200.00);
        cp.sacar(100.00);
    }
}

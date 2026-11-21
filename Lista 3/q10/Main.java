package q10;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("1001-1", 500.00);
        Conta c2 = new Conta("2002-2", 200.00);

        try {
            c1.transferir(c2, 150.00);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c1.transferir(c2, 1000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro de Saldo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de Argumento: " + e.getMessage());
        }

        try {
            c1.transferir(null, 50.00);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c1.transferir(c2, -10.00);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.printf("Saldos finais -> Conta %s: R$ %.2f | Conta %s: R$ %.2f%n",
                c1.getNumero(), c1.getSaldo(), c2.getNumero(), c2.getSaldo());
    }
}

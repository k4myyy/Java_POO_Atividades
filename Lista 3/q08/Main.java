package q08;

public class Main {
    public static void main(String[] args) {

        try {
            Produto p1 = new Produto("Teclado Mecânico", 250.00, 10);
            System.out.println("Cadastrado com sucesso: " + p1);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha ao cadastrar: " + e.getMessage());
        }

        try {
            Produto p2 = new Produto("   ", 100.00, 5);
            System.out.println("Cadastrado com sucesso: " + p2);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha ao cadastrar: " + e.getMessage());
        }

        try {
            Produto p3 = new Produto("Mouse Gamer", -50.00, 3);
            System.out.println("Cadastrado com sucesso: " + p3);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha ao cadastrar: " + e.getMessage());
        }

        try {
            Produto p4 = new Produto("Monitor", 900.00, -1);
            System.out.println("Cadastrado com sucesso: " + p4);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha ao cadastrar: " + e.getMessage());
        }
    }
}

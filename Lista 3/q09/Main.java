package q09;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code", 2);

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.print("Tentativa " + i + ": ");
                livro.emprestar();
            } catch (LivroIndisponivelException e) {
                System.out.println("Erro -> " + e.getMessage());
            }
        }
    }
}

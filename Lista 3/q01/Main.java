package q01;

public class Main {
    public static void main(String[] args) {
        Funcionario clt = new FuncionarioCLT("Ana Silva", 4000.00);
        Funcionario pj = new FuncionarioPJ("Carlos Souza", 6000.00);

        System.out.printf("Funcionário CLT: %s | Salário Final: R$ %.2f%n", clt.getNome(), clt.calcularSalario());
        System.out.printf("Funcionário PJ: %s | Salário Final: R$ %.2f%n", pj.getNome(), pj.calcularSalario());
    }
}

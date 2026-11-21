package q07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro (numerador): ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro (denominador): ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão inteira: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
        } finally {
            System.out.println("Operação encerrada.");
            scanner.close();
        }
    }
}

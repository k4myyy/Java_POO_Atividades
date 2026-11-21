package q02;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo(5.0),
            new Retangulo(4.0, 6.0),
            new Triangulo(3.0, 8.0)
        };

        for (FormaGeometrica forma : formas) {
            System.out.printf("%s -> Área: %.2f%n", forma.toString(), forma.calcularArea());
        }
    }
}

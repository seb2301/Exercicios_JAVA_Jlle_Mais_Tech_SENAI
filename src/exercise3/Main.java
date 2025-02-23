package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        final double PI = 3.14159;

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", area);

        scanner.close();
    }
}

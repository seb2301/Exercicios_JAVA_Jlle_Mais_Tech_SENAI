package exercise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double A = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double B = scanner.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.2f%n", media);

        scanner.close();
    }
    
}

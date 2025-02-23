package exercise4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int B = scanner.nextInt();

        int produto = A * B;

        System.out.println("PRODUTO = " + produto);

        scanner.close();
    }
    
}

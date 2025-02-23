package exercise2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int B = scanner.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }

    
}

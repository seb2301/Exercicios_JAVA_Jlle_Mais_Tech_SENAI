package extra2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int age = scanner.nextInt();

        if(age >= 0 && age <= 12) {
            System.out.println("Categoria: Criança");
        } else if(age >= 13 && age <= 19) {
            System.out.println("Categoria: Adolescente");
        } else if(age >= 20) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade inválida.");
        }

        scanner.close();
    } 
}

package initial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        byte number1;
        number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 499999;

        double decimal1 = 3.14;
        float decimal2 = 1.0f;
        char sexo = 'M';

        boolean isActive = false;

        final double PI = 3.14;

        int idade = 15;
        boolean habilitado = false;

        System.out.println(idade > 18);
        System.out.println(idade < 18);

        System.out.println(habilitado == true);
        System.out.println(idade > 18 && habilitado = true);

        Scanner scan = new Scanner(System.in);

        //string
        scan.next();
        scan.nextLine();

        // inteiros
        scan.nextInt();

        // decimais
        scan.nextDouble();
        scan.nextFloat();

        // Lógico
        scan.nextBoolean();
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("CADASTRO DE USUÁRIO\n Nome Completo:  ");
        String nomeCompleto = scan.nextLine();

        System.out.print("Idade: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.print("Endereço: ");
        String endereco = scan.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.printf("Nome Completo: %s \n Idade: %d \n Endereço: %s \n", nomeCompleto, age, endereco);

        if (age >= 18) {
            System.out.println("Usuário maior de idade.");
        } else {
            System.out.println("Usuário menor de idade.");
        }
    }
}

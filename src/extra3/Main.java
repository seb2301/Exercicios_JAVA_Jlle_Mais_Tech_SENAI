package extra3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de serviço (em anos): ");
        int tempoServico = scanner.nextInt();

        double bonus;

        if (tempoServico > 5) { 
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }

        double novoSalario = salario + bonus;

        System.out.printf("Seu salário original é de R$ %.2f%n", salario);
        System.out.printf("Bônus recebido é de R$ %.2f%n", bonus);
        System.out.printf("Novo salário é de R$ %.2f%n", novoSalario);

        scanner.close();
    } 
}

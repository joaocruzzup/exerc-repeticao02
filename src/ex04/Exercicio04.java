package ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("Boas-vindas a Calculadora - Soma de inteiros positivos");
        System.out.println("------------------------------------------------------");

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %dª número: ", i);
            double num = sc.nextDouble();

            while (num < 0){
                System.out.println("------------------");
                System.out.println("Entrada inválida!\nDigite um número positivo!");
                System.out.printf("Digite o %dª número: ", i);
                num = sc.nextDouble();
            }
            soma += num;

        }
        System.out.println("----------------------------");
        System.out.printf("A soma dos números é: %.2f", soma);


    }
}

package ex02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Boas-Vindas a Calculadora de médias de números inteiros!");
        System.out.println("--------------------------------------------------------");

        System.out.print("Digite a quantidade de números para calcular a média: ");
        int n = sc.nextInt();
        System.out.println("------------------");

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o %dª número: ", i);
            soma += sc.nextInt();
        }

        // Considerando que a calculadora é de inteiros, considerei a média como inteiro também
        int media = soma / n;

        System.out.println("-----------------------------");
        System.out.printf("A média desses números é: %d %n", media);
        System.out.println("-----------------------------");

    }
}


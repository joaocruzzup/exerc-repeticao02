package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("Boas-vindas a Calculadora de Maior e Menor");
        System.out.println("------------------------------------------");

        System.out.println("Digite 10 números para compararmos!");

        double maiorNumero = Double.MIN_VALUE;
        double menorNumero = Double.MAX_VALUE;

        int i = 1;
        // Nesse laço, a 1ª iteração sempre irá alterar o maiorNumero e menorNumero para qualquer valor digitado.
        while (i <= 10){
            System.out.printf("Digite o %dª número: ", i);
            double numEntrada = sc.nextDouble();

            if (numEntrada < menorNumero) {
                menorNumero = numEntrada;
            }

            if (numEntrada > maiorNumero) {
                maiorNumero = numEntrada;
            }

            i++;
        }

        System.out.println("----------------------");
        System.out.printf("O menor valor é: %.2f %n", menorNumero);
        System.out.printf("O maior valor é: %.2f", maiorNumero);
    }
}

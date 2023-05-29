package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("Boas-vindas a Calculadora - Soma dos impares no intervalo");
        System.out.println("---------------------------------------------------------");

        System.out.print("Digite o valor inicial: ");
        int valorInicial = sc.nextInt();

        System.out.print("Digite o valor final: ");
        int valorFinal = sc.nextInt();

        if (valorFinal < valorInicial){
            System.out.println("------------------------------");
            System.out.println("Intervalo de valores inválidos");
            System.out.println("O programa será encerrado");
            System.exit(0);
        }

        // Considerei o intervalo incluindo tanto para o valor Inicial quanto para o Valor Final
        System.out.println("-------------------------------------");
        System.out.printf("Os números impares entre %d e %d são: %n",valorInicial, valorFinal);
        int soma = 0;
        for (int i = valorInicial; i <= valorFinal; i ++){
            if ((i % 2) != 0){
                soma += i;
                System.out.printf("%d | ", i);
            }
        }

        System.out.println("\n---------------------------------------------");
        System.out.printf("A soma desses números ímpares é: %d %n", soma);
        System.out.println("---------------------------------------------");

    }
}

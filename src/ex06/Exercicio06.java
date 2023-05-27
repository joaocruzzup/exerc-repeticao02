package ex06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int valorInicial = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int valorFinal = sc.nextInt();

        int soma = 0;
        for (int i = valorInicial; i < valorFinal; i ++){
            if ((i % 2) != 0){
                soma += i;
            }
        }

        System.out.printf("A soma dos números impares entre %d e %d é: %d", valorInicial, valorFinal, soma);


    }
}

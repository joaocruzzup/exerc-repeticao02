package ex07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Boas-vindas ao verificador de números primos");
        System.out.println("--------------------------------------------");

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                count += 1;
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Resposta com o código utilizando for: ");

        if (count == 2 ){
            System.out.printf("O número %d é primo! %n", num);
        } else {
            System.out.printf("O número %d não é primo! %n", num);
        }

        // Criei um código também com uma lógica de como seria utilizando apenas o if-else
        // Porque para números grandes talvez com o for seja demorado
        // O código abaixo é apenas para verificar se ambos estão batendo

        System.out.println("-------------------------------------------------");
        System.out.println("Resposta com o código utilizando apenas if e else: ");

        if ((num == 2) || (num == 3) || (num == 5)){
            System.out.printf("O número %d é primo! %n", num);
        } else if (((num % 2) != 0 && (num % 3) != 0 && (num % 5) != 0 ) && (num != 1) && (num > 0)) {
            System.out.printf("O número %d é primo! %n", num);
        } else {
            System.out.printf("O número %d não é primo! %n", num);
        }

    }
}

package ex07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if ((num == 2) || (num == 3) || (num == 5)){
            System.out.printf("O número %d é primo! %n", num);
        } else if (((num % 2) != 0 && (num % 3) != 0 && (num % 5) != 0 ) && (num != 1) && (num > 0)) {
            System.out.printf("O número %d é primo! %n", num);
        } else {
            System.out.printf("O número %d não é primo! %n", num);
        }

    }
}

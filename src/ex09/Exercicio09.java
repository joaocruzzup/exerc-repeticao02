package ex09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        long mult = 1;
        for (int i = num; i > 0; i--){
            mult *= i;
        }
        System.out.printf("%d! é igual a: %d", num, mult);
    }
}

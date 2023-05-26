package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números");

        double maiorNumero = 0;
        double menorNumero = 0;

        int i = 1;

        while (i <= 10){
            System.out.printf("Digite o %dª número: ", i);
            double numEntrada = sc.nextDouble();

            if (i == 1) {
                maiorNumero = (numEntrada > 4.9E-324) ? numEntrada : maiorNumero;
                menorNumero = (numEntrada < 1.7976931348623157E308) ? numEntrada : menorNumero;
            }

            if (numEntrada < menorNumero) {
                menorNumero = numEntrada;
            }

            if (numEntrada > maiorNumero) {
                maiorNumero = numEntrada;
            }

            i++;
        }

        System.out.printf("O menor valor é: %.2f %n", menorNumero);
        System.out.printf("O maior valor é: %.2f", maiorNumero);
    }
}

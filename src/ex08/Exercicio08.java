package ex08;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Calculadora da soma dos primeiros números ímpares");
        System.out.println("-------------------------------------------------");

        System.out.println("Os 50 primeiros números ímpares são:");

        int i = 0;
        int soma = 0;
        int contador = 0;
        while (contador <50){
            if ((i % 2) != 0){
                System.out.printf("%d |", i);
                soma += i;
                contador +=1;
            }
            i++;
        }
        System.out.println("\n---------------------------------------");
        System.out.println("A soma dos 50 primeiros ímpares é: " + soma );
        System.out.println("---------------------------------------");
    }
}

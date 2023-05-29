package ex01;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Impressão de 1 até 100 utilizando laço for");
        System.out.println("------------------------------------------");

        // O laço imprime de 1 a 100 horizontal e quebra linha a cada 20.
        for (int i = 1; i<=100; i++){
            System.out.printf("%d | ", i);
            if ((i % 20) == 0){
                System.out.printf("%n");
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Impressão de 1 até 100 utilizando laço while");
        System.out.println("--------------------------------------------");

        // O laço imprime de 1 a 100 horizontal e quebra linha a cada 20.
        int i = 1;
        while (i <= 100){
            System.out.printf("%d | ", i);
            if ((i % 20) == 0){
                System.out.printf("%n");
            }
            i ++;
        }

    }
}

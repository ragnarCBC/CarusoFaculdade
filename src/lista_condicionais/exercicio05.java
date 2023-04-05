package lista_condicionais;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe a quantidade de estoque");
        int estoque = keyboard.nextInt();

        System.out.println("informe a quantidade maxima do estoque");
        int estoqueMAX = keyboard.nextInt();

        System.out.println("informe a quantidade minima do estoque");
        int estoqueMIN = keyboard.nextInt();
        double estoqueMED = ((estoqueMAX + estoqueMIN)/ 2 );

        System.out.println("o estoque medio é"+estoqueMED);
        if (estoque >= estoqueMED ) {
            System.out.println("Nao é necessario comprar mais do prodto");
        }
        else {
            System.out.println("é necessario compra mais do produto");
        }
    }
}

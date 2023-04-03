package lista_condicionais;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {Scanner keyboard = new Scanner(System.in);
        System.out.println("informe a quantidade de maçãs");
        int quantidade = keyboard.nextInt();
        if (quantidade >= 12) {
            System.out.println("o preço sera de R$ 1,00");
        }else {
            System.out.println("o preço sera de R$ 1,30");
        }
    }
}
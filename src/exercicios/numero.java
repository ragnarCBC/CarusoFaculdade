package exercicios;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe um numero inteiro");
        int numero = keyboard.nextInt();
        if(numero > 0) {
            System.out.println("o numero é :" + numero);
        }
        keyboard.close();
    }
}

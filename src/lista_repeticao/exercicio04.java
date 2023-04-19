package lista_repeticao;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int contador = 1;
        while(contador <= 2) {
            System.out.println("escreva primeiro numero");
           int numero1 = keyboard.nextInt();
            System.out.println("escreva seugundo numero");
            int numero2 = keyboard.nextInt();
            System.out.println("escreva terceiro numero");
            int numero3 = keyboard.nextInt();
            System.out.println("escreva quarto numero");
            int numero4 = keyboard.nextInt();
            System.out.println("escreva quinto numero");
            int numero5 = keyboard.nextInt();
            System.out.println("escreva sextp numero");
            int numero6 = keyboard.nextInt();
            System.out.println("escreva setimo numero");
            int numero7 = keyboard.nextInt();
            System.out.println("escreva oitavo numero");
            int numero8 = keyboard.nextInt();
            System.out.println("escreva nono numero");
            int numero9 = keyboard.nextInt();
            System.out.println("escreva decimo numero");
            int numero10 = keyboard.nextInt();

            double total = (numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10) / 10;
            System.out.println("meida dos 10 numeros:" + total);
            contador++;



        }
    }
}

package lista_repeticao;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int contador = 1;
        int numeroposi = 0;
        int numeronegat = 0;
        while(contador <= 2) {
            System.out.println("escreva primeiro numero");
            int numero1 = keyboard.nextInt();
            if (numero1 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva segundo numero");
            int numero2 = keyboard.nextInt();
            if (numero2 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva terceiro numero");
            int numero3 = keyboard.nextInt();
            if (numero3 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva quarto numero");
            int numero4 = keyboard.nextInt();
            if (numero4 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva quinto numero");
            int numero5 = keyboard.nextInt();
            if (numero5 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva sexto numero");
            int numero6 = keyboard.nextInt();
            if (numero6 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva setimo numero");
            int numero7 = keyboard.nextInt();
            if (numero7 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva oitavo numero");
            int numero8 = keyboard.nextInt();
            if (numero8 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva nono numero");
            int numero9 = keyboard.nextInt();
            if (numero9 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }
            System.out.println("escreva decimo numero");
            int numero10 = keyboard.nextInt();
            if (numero10 < 0) {
                numeroposi++;
            } else {
                numeronegat++;
            }

            System.out.println("numero total de positivos:" + numeroposi + "\n" + "numero total de negativos:" + numeronegat);
            contador++;

            }
    }


}

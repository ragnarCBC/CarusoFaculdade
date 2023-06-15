package strings;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String[] palavras = texto.split(" ");

        System.out.println("Palavras separadas por linha:");

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);

        }
    }
}
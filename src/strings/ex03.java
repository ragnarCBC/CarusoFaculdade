package strings;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        int contadorPalavras = contarPalavras(texto);

        System.out.println("Número de palavras: " + contadorPalavras);
    }

    public static int contarPalavras(String texto) {
        String[] palavras = texto.trim().split(" ");
        return palavras.length;
    }
}

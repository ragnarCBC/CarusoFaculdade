package strings;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    public static String inverterPalavra(String palavra) {
        StringBuilder builder = new StringBuilder(palavra);
        return builder.reverse().toString();
    }
}

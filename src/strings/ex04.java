package strings;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            int quantidade = contarPalavra(frase, palavra);

            System.out.println("Frase digitada: " + frase);
            System.out.println("Palavra digitada: " + palavra);
            System.out.println("Quantidade de vezes que a palavra aparece na frase: " + quantidade);
        }

        public static int contarPalavra (String frase, String palavra){
            String[] palavras = frase.split(" ");
            int quantidade = 0;

            for (String p : palavras) {
                if (p.equalsIgnoreCase(palavra)) {
                    quantidade++;
                }
            }

            return quantidade;
        }
    }


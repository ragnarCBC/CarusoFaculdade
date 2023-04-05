package lista_condicionais.extra;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Insira o ano para descobrir se é ano bissexto: ");
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " não é um ano bissexto!");
        }

    }
}
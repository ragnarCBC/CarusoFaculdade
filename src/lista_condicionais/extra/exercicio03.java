package lista_condicionais.extra;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.print("Informe um ano para descobrir se é bissexto: ");
        ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
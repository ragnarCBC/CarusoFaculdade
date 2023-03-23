package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = input.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = input.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = input.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é: " + idadeEmDias + " dias");

        input.close();
    }
}
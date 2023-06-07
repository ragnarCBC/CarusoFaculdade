package FUNCOES_E_PROCEDIMENTOS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        System.out.print("digite sua nota: ");
        nota = scan.nextInt();
        verificadoDeNota(nota);


    }

    static String verificadoDeNota(int pontuacao) {
        if (pontuacao <= 60) {
            System.out.println("Conceito: Insatisfatório");
        } else if (pontuacao <= 75) {
            System.out.println("Conceito: Satisfatório");
        } else if (pontuacao <= 90) {
            System.out.println("Conceito: Bom");
        } else {
            System.out.println("Conceito: Ótimo");
        }
        return null;
    }
}

package lista_condicionais;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicio;
        int horaFinal;

        System.out.println("Insira somente a hora em que começou o jogo de Xadrez no formato de 24h! ");
        horaInicio = scan.nextInt();

        System.out.println("Agora insira somente a hora em que o jogo terminou no formato de 24h!");
        horaFinal = scan.nextInt();

        System.out.println("O jogo durou quantos dias? ");
        int dias = scan.nextInt();

        int totalHoras = (horaFinal - horaInicio);

        if (dias >= 1 || totalHoras > 24) {
            System.out.println("O jogo não pode durar mais de um dia, portanto foi considerado invalido!");
        } else {
            System.out.println("O jogo foi considerado válido, visto que durou menos de um dia!");
            System.out.println("Tempo total de jogo: " + totalHoras + " horas.");
        }
    }
}
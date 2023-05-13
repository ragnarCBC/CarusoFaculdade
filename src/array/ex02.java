package array;

import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        // Solicita um novo número ao usuário
        System.out.print("Digite um número para buscar: ");
        int numeroBusca = input.nextInt();

        // Faz uma busca no array para verificar se o número está presente
        boolean achou = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusca) {
                achou = true;
                break;
            }
        }

        // Escreve a mensagem de acordo com o resultado da busca
        if (achou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}


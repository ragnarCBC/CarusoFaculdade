package array;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        int tamanho = 3;
        int[][] A = new int[tamanho][tamanho];
        int[][] B = new int[tamanho][tamanho];
        int[][] soma = new int[tamanho][tamanho];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("digite o valor da matriz " + "[" + i + "] [" + j + "] :");
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println("agora matriz B");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("digite o valor da matriz " + "[" + i + "] [" + j + "] :");
                B[i][j] = scan.nextInt();
            }
        }
        for(int i = 0 ; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
               soma[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("matriz A");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("matriz B");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matriz soma");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package array;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        int tamanho = 4;
        int[][] A = new int[tamanho][tamanho];
        int menor = 9999;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("digite o valor da matriz " + "[" + i + "] [" + j + "] :");
                A[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (A[i][j] < menor) {
                    menor = A[i][j];
                }
            }
        }

        System.out.println("O menor valor da matriz: " + menor);

    }
}

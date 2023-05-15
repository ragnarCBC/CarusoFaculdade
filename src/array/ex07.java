package array;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int tamanho = 3;
        int[][] array = new int[tamanho][tamanho];
        int[][] resultadoArray = new int[tamanho][tamanho];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("digite a matriz [" + i + "] [" + j + "]:");
                array[i][j] = scan.nextInt();
            }
        }

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultadoArray[i][j] = array[i][j] *  numero;
            }

        }

        System.out.println("matriz original");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("matriz original");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(resultadoArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}

package Exemplos;

import java.util.Scanner;

public class UsandoMetodos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe um valor");
        int numeroA = scan.nextInt();
        System.out.println("informe um valor");
        int numeroB = scan.nextInt();

        System.out.println("soma: " + somar(numeroA, numeroB) );
        System.out.println("subtraçao: " + subtrair(numeroA, numeroB) );
        System.out.println("multiplicaçao: " + multiplicar(numeroA, numeroB) );
        System.out.println("diviçao: " + dividir(numeroA, numeroB) );

        System.out.println("numero A dentro do main " + numeroA);
        System.out.println("numero B dentro do main " + numeroB);
        scan.close();
    }

    static int somar(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }static int subtrair(int numeroA, int numeroB) {
        return numeroA - numeroB;
    }static int multiplicar(int numeroA, int numeroB) {
        return numeroA * numeroB;
    }
    static int dividir(int numeroA, int numeroB) {
        int resultado = 0;
        if (numeroB != 0) {
            resultado = numeroA / numeroB;
        }
        else{
            System.out.println("erro");
        }
        System.out.println("numero A dentro " + numeroA);
        System.out.println("numero B dentro " + numeroB);
        return resultado;
    }
}

package lista_condicionais.extra;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioBruto;

        System.out.println("Informe o seu salário bruto: ");
        salarioBruto = scan.nextDouble();

        salarioBruto *= 0.9;

        if (salarioBruto <= 1000) {
            salarioBruto *= 1.05;
            System.out.println("Salário liquido foi de: " + salarioBruto);
        }

    }
}
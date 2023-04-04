package lista_condicionais;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe a primeira nota");
        double nota1 = keyboard.nextDouble();
        System.out.println("informe a segunda nota");
        double nota2 = keyboard.nextDouble();
        System.out.println("informe a terceira nota");
        double nota3 = keyboard.nextDouble();
        double media = ((nota1 + nota2 + nota3)/ 3);
        double aproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + media)/ 7;
        System.out.println("media:" + media + " aproveitamento:" + aproveitamento);
        if (aproveitamento >= 9.0){
            System.out.print("nota:");
            System.out.println("A");
        }
        if (aproveitamento >= 7.5 ) {
            if (aproveitamento < 9.0) {
                System.out.print("nota:");
                System.out.println("B");
            }
        }
        if (aproveitamento >= 6.0 ) {
            if (aproveitamento < 7.5) {
                System.out.print("nota:");
                System.out.println("C");
            }
        }
        else {
            System.out.print("nota:");
            System.out.println("D");
        }




    }
}

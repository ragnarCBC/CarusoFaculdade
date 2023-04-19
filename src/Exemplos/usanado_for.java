package Exemplos;

import java.util.Scanner;

public class usanado_for {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for(int contador = 0; contador < 2; contador++) {
            System.out.print("informe o nome do aluno:");
            String nome= keyboard.nextLine();

            System.out.print("informe a nota da primeira avaliacao:");
            double nota1= keyboard.nextDouble();

            System.out.print("informe a nota da segunda avaliacao:");
            double nota2= keyboard.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("O aluno:" + nome + " - media:" + media);
            keyboard.nextLine();
        }
        keyboard.close();
    }
}



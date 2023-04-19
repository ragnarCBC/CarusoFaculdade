package Exemplos;

import java.util.Scanner;

public class usando_DoWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int contador = 0;
        do {
            System.out.print("informe o nome do aluno:");
            String nome= keyboard.nextLine();

            System.out.print("informe a nota da primeira avaliacao:");
            double nota1= keyboard.nextDouble();

            System.out.print("informe a nota da segunda avaliacao:");
            double nota2= keyboard.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("O aluno:" + nome + " - media:" + media);
            contador++;
            keyboard.nextLine();
        } while(contador < 2);
        keyboard.close();
    }
}



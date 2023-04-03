package lista_condicionais;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nota1 = 5;
        int nota2 = 10;
        double calculo = (nota1 + nota2) / 2;
        System.out.println(calculo);
        if (calculo >= 7){
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.println("O aluno foi reprovado");
        }

    }
}
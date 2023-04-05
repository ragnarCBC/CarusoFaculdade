package lista_condicionais;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = scan.nextLine();
        System.out.println("Digite o ano de nascimento");
        int data = scan.nextInt();
        System.out.println("Digite o ano que ingressou no trabalho");
        int entrada = scan.nextInt();


        int calculo = 2023- entrada ;
        int idade = 2023 - data;
        System.out.println(nome + " tem " + calculo +" de trabalho " + " e " + idade + " idade ");
        if (calculo >= 30 || idade >= 65 || idade >= 60 && calculo >=25) {
            System.out.println(nome + " foi permitido");
        }
        else {
            System.out.println(nome+ " foi negado");
        }


    }
}

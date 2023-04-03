package lista_condicionais;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        int codigo = 54321;
        int usuario = 12345;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe o usuario");
        int usuarioInput = keyboard.nextInt();
        if (usuarioInput == usuario ){
            System.out.println("usuario correta");
            System.out.println("informe a senha");
            int senha = keyboard.nextInt();

            if (codigo == senha){
                System.out.println("senha correta");
                System.out.println("acesso permitido");

            }
            else {
                System.out.println("senha incorreto");
                System.out.println("acesso negado");
            }
        }
        else {
            System.out.println("usuario incorreto");
            System.out.println("acesso negado");
        }



    }
}

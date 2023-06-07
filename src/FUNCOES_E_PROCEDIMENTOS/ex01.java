package FUNCOES_E_PROCEDIMENTOS;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = 0;
        System.out.print("digite sua idade: ");
        idade = scan.nextInt();
        verificadoDeCategoria(idade);


    }

     static String verificadoDeCategoria(int idade) {
         String catergoria;
         if (idade <= 10) {
             catergoria = "mirim";
             System.out.println("a cateroria de " + idade + " anos é " + catergoria);
         } else if (idade <= 14) {
             catergoria = "Infantil";
             System.out.println("a cateroria de " + idade + " anos é " + catergoria);
         } else if (idade <= 19) {
             catergoria = "Juvenil";
             System.out.println("a cateroria de " + idade + " anos é " + catergoria);

         } else {
             catergoria = "Adulto";
             System.out.println("a cateroria de " + idade + " anos é " + catergoria);
         }
         return null;
     }
}

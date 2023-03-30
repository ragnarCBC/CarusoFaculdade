package exercicios;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("informe um numero inteiro");
        int numero = keyboard.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o numero é par");
        } else {
            System.out.println("o numero é impar");
        }
        keyboard.close();}
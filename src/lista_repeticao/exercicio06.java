package lista_repeticao;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int contador = 1;
        int numeroPar = 0;
        int numeroImpar = 0;

        while(contador <= 2) {
            System.out.println("escreva primeiro numero");
            int numero1 = keyboard.nextInt();
            if (numero1 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva segundo numero");
            int numero2 = keyboard.nextInt();
            if (numero2 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva terceiro numero");
            int numero3 = keyboard.nextInt();
            if (numero3 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva quarto numero");
            int numero4 = keyboard.nextInt();
            if (numero4 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva quinto numero");
            int numero5 = keyboard.nextInt();
            if (numero5 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva sexto numero");
            int numero6 = keyboard.nextInt();
            if (numero6 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva setimo numero");
            int numero7 = keyboard.nextInt();
            if (numero7 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva oitavo numero");
            int numero8 = keyboard.nextInt();
            if (numero8 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva nono numero");
            int numero9 = keyboard.nextInt();
            if (numero9 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }
            System.out.println("escreva decimo numero");
            int numero10 = keyboard.nextInt();
            if (numero10 % 2 == 0){
                numeroPar++;
            }
            else {
                numeroImpar++;
            }

            System.out.println("numero total de pares:" + numeroPar + "\n" + "numero total de impares:" + numeroImpar);
            contador++;





        }
    }
}

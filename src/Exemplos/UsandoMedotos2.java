package Exemplos;

import java.util.Scanner;

public class UsandoMedotos2 {
    public static void main(String[] args) {

        String nome = "";
        System.out.println("nome: " + nome);
        nome += lerNome();
        System.out.println("nome: " + nome);
        nome += lerSobrenome(nome);
        System.out.println("nome: " + nome);
    }

    static String lerNome(){
        Scanner scan = new Scanner(System.in);
        System.out.print("informe o seu primeiro nome: ");
        return scan.nextLine();
    }

    static String lerSobrenome(String nome){
        Scanner scan = new Scanner(System.in);
        System.out.print("informe o seu sobrenome: ");
        return nome + " " + scan.nextLine();
    }
}

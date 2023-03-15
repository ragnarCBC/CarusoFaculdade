package Exemplos;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("you name is " + name);
    }
}

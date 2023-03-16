package Exemplos;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {

        System.out.println("Welcome to java programming");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String massage = scan.nextLine();
        System.out.println("You message is: " + massage);

    }
}

package Exemplos;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {

        System.out.println("Welcome to java programming");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type your message here: ");
        String massage = keyboard.nextLine();
        System.out.println("Your message is: " + massage);
        keyboard.close();
    }
}

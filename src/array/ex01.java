package array;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner scan = new Scanner(System.in);
        int i = 0;
        for(i = 0; i < 10; i++){
            System.out.println("digite o " + (i + 1) + " nome");
            nomes[i] = scan.nextLine();

        }
        for(i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("\n------------------\n");
        for(i = nomes.length - 1;i >= 0;i--){
            System.out.println(nomes[i]);
        }
    }
}

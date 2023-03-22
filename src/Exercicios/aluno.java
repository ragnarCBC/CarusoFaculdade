package Exercicios;
import java.util.Scanner;
public class aluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota3;
        double nota2;
        System.out.print("digite a nota 1:");
        nota1 = scan.nextDouble();
        System.out.print("digite a nota 2:");
        nota2 = scan.nextDouble();
        System.out.print("digite a nota 3:");
        nota3 = scan.nextDouble();
        double total = (nota1 + nota2 + nota3) / 3 ;
        System.out.print("nota final é:" + total);


    }
}

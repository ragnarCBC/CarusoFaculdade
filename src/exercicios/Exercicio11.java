package exercicios;
import java.util.Scanner;
public class Exercicio11 {
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
        double total = (nota1 * 2) + (nota2 * 3) + (nota3* 5) / 10 ;
        System.out.print("nota final é:" + total);


    }
}

package Exercicios;
import java.util.Scanner;
public class salario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salario;
        double porcetengem;
        System.out.print("digite o salario:");
        salario = scan.nextDouble();
        System.out.println("seu salario é:" + salario);

        System.out.print("digite a porcentagem:");
        porcetengem = scan.nextDouble();
        System.out.println(salario % porcetengem);

    }
}

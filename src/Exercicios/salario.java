package Exercicios;
import java.util.Scanner;
public class salario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario;
        double ajuste;

        System.out.println("Qual o seu salario?: ");
        salario = scan.nextDouble();

        System.out.println("Seu salario é: " + salario);

        System.out.println("Escolha uma porcentagem para um reajuste salarial");
        ajuste = scan.nextDouble();

        double valorSalario = salario;
        double porcentagem = ajuste / 100;


        double resultado = salario + (salario * porcentagem);


        System.out.println("Valor do salário: " + "Porcentagem: " + resultado + "%");

    }
}

package exercicios;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario;
        double ajuste;

        System.out.print("Qual o seu salario?: ");
        salario = scan.nextDouble();

        System.out.println("Seu salario é: " + salario);

        System.out.print("Escolha uma porcentagem para um reajuste salarial");
        ajuste = scan.nextDouble();


        double porcentagem = ajuste / 100;


        double resultado = salario + (salario * porcentagem);


        System.out.println("Valor do salário: " + "Porcentagem: " + resultado + "%");

    }
}

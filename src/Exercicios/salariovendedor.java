package Exercicios;
import java.util.Scanner;

public class salariovendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = sc.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: ");
        double comissaoPorCarro = sc.nextDouble();

        double comissaoTotal = comissaoPorCarro * numCarrosVendidos;
        double bonus = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + bonus;

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        sc.close();
    }
}

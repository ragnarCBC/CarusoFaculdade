package exercicios;
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



        sc.close();
    }
}

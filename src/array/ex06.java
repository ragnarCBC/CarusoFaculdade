package array;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int numMeses = 12;
        double[] temperaturas = new double[numMeses];

        // Leitura das temperaturas médias dos meses
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Cálculo da menor temperatura média
        double menorTemperatura = temperaturas[0];
        for (int i = 1; i < numMeses; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        // Cálculo da maior temperatura média
        double maiorTemperatura = temperaturas[0];
        for (int i = 1; i < numMeses; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        // Cálculo da média da temperatura do ano
        double somaTemperaturas = 0;
        for (int i = 0; i < numMeses; i++) {
            somaTemperaturas += temperaturas[i];
        }
        double mediaTemperaturaAno = somaTemperaturas / numMeses;

        // Contagem de meses com temperatura inferior à média anual
        int mesesInferioresMediaAnual = 0;
        for (int i = 0; i < numMeses; i++) {
            if (temperaturas[i] < mediaTemperaturaAno) {
                mesesInferioresMediaAnual++;
            }
        }

        // Impressão dos resultados
        System.out.println("Menor temperatura média: " + menorTemperatura);
        System.out.println("Maior temperatura média: " + maiorTemperatura);
        System.out.println("Média da temperatura do ano: " + mediaTemperaturaAno);
        System.out.println("Quantidade de meses em que a temperatura foi inferior à média anual: " + mesesInferioresMediaAnual);
    }
}


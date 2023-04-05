package lista_condicionais.extra;
import java.util.Scanner;
public class exercicio06extr {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int quantidadeSim = 0;

            System.out.println("Responda às seguintes perguntas sobre o crime:");

            System.out.println("1. Você já trabalhou com a vítima? (sim/não)");
            String resposta1 = input.nextLine();
            if (resposta1.equals("sim")) {
                quantidadeSim++;
            }

            System.out.println("2. Você telefonou para a vítima? (sim/não)");
            String resposta2 = input.nextLine();
            if (resposta2.equals("sim")) {
                quantidadeSim++;
            }

            System.out.println("3. Você mora próxima à vítima? (sim/não)");
            String resposta3 = input.nextLine();
            if (resposta3.equals("sim")) {
                quantidadeSim++;
            }

            System.out.println("4. Você devia dinheiro à vítima? (sim/não)");
            String resposta4 = input.nextLine();
            if (resposta4.equals("sim")) {
                quantidadeSim++;
            }

            System.out.println("5. Você esteve no local do crime? (sim/não)");
            String resposta5 = input.nextLine();
            if (resposta5.equals("sim")) {
                quantidadeSim++;
            }

            System.out.println("Classificação: ");

            if (quantidadeSim == 0 || quantidadeSim == 1) {
                System.out.println("Inocente");
            } else if (quantidadeSim == 2) {
                System.out.println("Suspeita");
            } else if (quantidadeSim == 3 || quantidadeSim == 4) {
                System.out.println("Cúmplice");
            } else {
                System.out.println("Assassino");
            }

            input.close();
        }
    }



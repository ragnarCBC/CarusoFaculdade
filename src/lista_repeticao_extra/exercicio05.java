package lista_repeticao_extra;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int alimentacao = 0;
        int gasolina = 0;
        int saude = 0;
        int escolha = 0;
        int maior = 0;
        int menor = 99999;
        String maiorCategoria = "";
        String menorCategoria = "";


        do {
            System.out.println("quanto foi gasto de alimentacao");
            alimentacao += scan.nextInt();
            System.out.println("quanto foi gasto de gasolina");
            gasolina += scan.nextInt();
            System.out.println("quanto foi gasto de saude");
            saude += scan.nextInt();
            System.out.println("voce deseja adicionar mais valores? 1 - SIM 2-NAO");
            escolha = scan.nextInt();

            if (alimentacao == gasolina && gasolina == saude) {
                System.out.println("Todas as três variáveis têm o mesmo valor.");
            } else if (alimentacao == gasolina) {
                System.out.println("A alimentacao e gasolina tem o mesmo valor.");
            } else if (alimentacao == saude) {
                System.out.println("A alimentacao e saude tem o mesmo valor.");
            } else {
                System.out.println("A gasolina e saude tem o mesmo valor.");
            }

            if (alimentacao != gasolina && alimentacao != saude && gasolina != saude) {
                if (alimentacao > maior || saude > maior || gasolina > maior) {

                    if (alimentacao > maior) {
                        maior = alimentacao;
                        maiorCategoria = "alimentaçao";
                    }
                    if (saude > maior) {
                        maior = saude;
                        maiorCategoria = "saude";
                    }
                    if (gasolina > maior) {
                        maior = gasolina;
                        maiorCategoria = "gasolina";
                    }
                    System.out.println("maior " + maiorCategoria);

                }
            }

            if (alimentacao < menor || gasolina < menor || saude < menor) {
                if (alimentacao < menor) {
                    menor = alimentacao;
                    menorCategoria = "alimentaçao";
                }
                if (saude < menor) {
                    menor = saude;
                    menorCategoria = "saude";
                }
                if (gasolina < menor) {
                    maior = gasolina;
                    menorCategoria = "gasolina";
                }
                System.out.println("menor " + menorCategoria);
            }



            }while (escolha == 1) ;

        }

    }

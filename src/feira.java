import java.util.Scanner;

public class feira {
    public static void main(String[] args) {
        int x = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        String nome = "seila";
        char letra = 'a';
        boolean a = x == b && c == d;
        boolean v = x == b || c == d;
        System.out.println(a);
        System.out.println("&& é and e || é or");
        System.out.println(v);
        System.out.println(nome);
        System.out.println(letra);
        System.out.println("String é apenas pode usar aspas dupla e incial da variavel maiusculo");
        System.out.println("char é apenas para um caracter e usa aspas simples");
        Scanner teclado = new Scanner(System.in);
        String name = teclado.nextLine();
        int idade = teclado.nextInt();
        System.out.println(name);
        System.out.println(idade);

    }
}





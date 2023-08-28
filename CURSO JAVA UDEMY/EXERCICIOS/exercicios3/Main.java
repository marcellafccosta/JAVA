import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * //EXERCICIO UM
         * Scanner sc = new Scanner(System.in);
         * 
         * int senha = sc.nextInt();
         * 
         * while (senha != 2002) {
         * System.out.println("senha invalida");
         * senha = sc.nextInt();
         * }
         * System.out.println("acesso permitido");
         * 
         * sc.close();
         */

        /*
         * //EXERCICIO DOIS
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.print("digite o primeiro valor (x): ");
         * int x = sc.nextInt();
         * System.out.print("digite o primeiro valor (y): ");
         * int y = sc.nextInt();
         * 
         * while (x != 0 && y != 0) {
         * if (x > 0 && y > 0) {
         * System.out.println("Q1");
         * } else if (x < 0 && y > 0) {
         * System.out.println("Q2");
         * } else if (x < 0 && y < 0) {
         * System.out.println("Q3");
         * } else {
         * System.out.println("Q4");
         * }
         * 
         * x = sc.nextInt();
         * y = sc.nextInt();
         * 
         * }
         * 
         * sc.close();
         */


         //exercicio tres
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o seu combustivel preferido? ( 1. Alcool 2. Gasolina 3. Diesel 4.Fim))");
        int opcao = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4) {
            if (opcao == 1) {
                alcool++;
            } else if (opcao == 2) {
                gasolina++;
            } else if (opcao == 3) {
                diesel++;
            }

            opcao = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf(" Alcool: %d%n Gasolina: %d%n Diesel: %d", alcool, gasolina, diesel);

        sc.close();

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * //EXERCICIO UM
         * 
         * int num;
         * 
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.print("digite um numero: ");
         * num = sc.nextInt();
         * 
         * if (num < 0) {
         * System.out.println("NEGATIVO");
         * } else {
         * System.out.println("NAO NEGATIVO");
         * }
         * 
         * sc.close();
         */

        /*
         * //EXERCICIO DOIS
         * int num;
         * Scanner sc = new Scanner(System.in);
         * System.out.print("digite um numero: ");
         * num = sc.nextInt();
         * 
         * if (num % 2 == 0) {
         * System.out.println("PAR");
         * } else {
         * System.out.println("IMPAR");
         * }
         * 
         * sc.close();
         */

        /*
         * // EXERCICIO TRES
         * Scanner sc = new Scanner(System.in);
         * int num1, num2;
         * 
         * System.out.print("digite o primeiro numero: ");
         * num1 = sc.nextInt();
         * 
         * System.out.print("digite o segundo numero: ");
         * num2 = sc.nextInt();
         * 
         * if (num1 % num2 == 0 || num2 % num1 == 0) {
         * System.out.println("sao multiplos");
         * } else {
         * System.out.println("nao sao multiplos");
         * }
         * 
         * sc.close();
         */

        /*
         * //EXERCICIO CINCO
         * Scanner sc = new Scanner(System.in);
         * int horaInicial, horaFinal, duracao;
         * 
         * System.out.print("digite a hora inicial do jogo: ");
         * horaInicial = sc.nextInt();
         * 
         * System.out.print("digite a hora final do jogo: ");
         * horaFinal = sc.nextInt();
         * 
         * 
         * if (horaInicial < horaFinal) {
         * duracao = horaFinal - horaInicial;
         * } else {
         * duracao = 24 - horaInicial + horaFinal;
         * }
         * 
         * System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
         * sc.close();
         */

        /*
         * //EXERCICIO CINCO
         * Scanner sc = new Scanner(System.in);
         * int codigoItem, quantidade;
         * double total;
         * 
         * System.out.print("codigo do item: ");
         * codigoItem = sc.nextInt();
         * 
         * System.out.print("quantidade: ");
         * quantidade = sc.nextInt();
         * 
         * if (codigoItem == 1) {
         * total = quantidade * 4.00;
         * } else if (codigoItem == 2) {
         * total = quantidade * 4.50;
         * } else if (codigoItem == 3) {
         * total = quantidade * 5.00;
         * } else if (codigoItem == 4) {
         * total = quantidade * 2.00;
         * } else {
         * total = quantidade * 1.50;
         * }
         * 
         * System.out.println("total: R$" + total);
         * 
         * sc.close();
         */

        /*
         * //EXERCICIO SEIS
         * Scanner sc = new Scanner(System.in);
         * double num;
         * 
         * System.out.print("digite um numero: ");
         * num = sc.nextDouble();
         * 
         * if (num >= 0 && num <= 25) {
         * System.out.println("intervalo [0,25]");
         * } else if (num > 25 && num <= 50) {
         * System.out.println("intervalo (25,50]");
         * } else if (num > 50 && num <= 75) {
         * System.out.println("intervalo (50,75]");
         * } else if (num > 75 && num <= 100) {
         * System.out.println("intervalo (75,100]");
         * } else {
         * System.out.println("fora de intervalo");
         * }
         * 
         * sc.close();
         */

            /*
         //EXERCICIO SETE
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("digite o primeiro valor: ");
        x = sc.nextDouble();
        System.out.print("digite o segundo valor: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("origem");
        } else if (x == 0.0) {
            System.out.println("eixo x");
        } else if (y == 0.0) {
            System.out.println("eixo y");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else {
            System.out.println("Q4");
        }

        sc.close();*/

        //EXERCICIO OITO
        Scanner sc = new Scanner(System.in);
        double salario, imposto;
        System.out.print("digite um valor: ");
        salario = sc.nextDouble();  

        if (salario > 0.00 && salario < 2000.00) {
        System.out.println("isento");
        } else if (salario > 2000.01 && salario < 3000.00) {
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$%.2f", imposto);
        } else if (salario > 3000.01 && salario < 4500.00) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        System.out.printf("R$%.2f", imposto);
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$%.2f", imposto);
        }

        sc.close();

    }
}
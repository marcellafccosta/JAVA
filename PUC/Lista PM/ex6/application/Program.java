// Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem crescente. 
// Faça um programa que leia N conjuntos de 3 valores e acione o procedimento para cada conjunto (N deve ser lido do teclado).

package application;
import java.util.Scanner;
import entities.Valores;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Valores valores = new Valores();

        System.out.print("quantos conjuntos? ");
        int qntConjuntos = sc.nextInt();

        for (int i = 0; i < qntConjuntos; i++) {

            System.out.print("insira o primeiro valor: ");
            valores.valor1 = sc.nextDouble();

            System.out.print("insira o segundo valor: ");
            valores.valor2 = sc.nextDouble();

            System.out.print("insira o terceiro valor: ");
            valores.valor3 = sc.nextDouble();

            valores.ordemCrescente(valores.valor1, valores.valor2, valores.valor3);

        }

        sc.close();
    }
}
// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.


package negativos.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros serao digitados: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                vet[i] = sc.nextInt();
            }

            System.out.println("numeros negativos: ");
            for (int i = 0; i < n; i++) {
                if (vet[i] < 0) {
                    System.out.print(vet[i] + " ");
                }
            }
        }

        sc.close();

    }
}
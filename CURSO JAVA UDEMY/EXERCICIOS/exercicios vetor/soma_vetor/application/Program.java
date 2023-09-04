// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor

package soma_vetor.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {

            System.out.print(vetor[i] + " ");
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        System.out.println();
        System.out.print("SOMA = " + soma);
        double media = soma / n;
        System.out.println();
        System.out.print("MEDIA = ");
        System.out.print(media + " ");

        sc.close();
    }
}

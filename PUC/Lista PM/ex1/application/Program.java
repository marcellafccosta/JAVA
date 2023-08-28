// Faça um programa que leia um vetor A com 15 elementos inteiros. 
// Em seguida, construa um vetor B do mesmo tipo, em que cada elemento 
// de B deva ser o resultado do fatorial correspondente de cada elemento 
// de A. Imprima na tela os vetores A e B.

package application;

import java.util.Scanner;
import entities.Calculo;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculo calculo = new Calculo();

        System.out.println("Digite os valores:");
        for (int i = 0; i < 15; i++) {
            calculo.vetA[i] = sc.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            calculo.vetB[i] = calculo.calculaFat(calculo.vetA[i]);

        }

        System.out.println("Vetor Um");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%d ", calculo.vetA[i]);
        }

        System.out.println("Vetor Dois");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%d ", calculo.vetB[i]);
        }

        sc.close();
    }
}
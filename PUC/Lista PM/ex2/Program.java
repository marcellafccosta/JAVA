// Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A. 
// Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de 
// A são par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetA[] = new int[10];
        int vetParImpar[] = new int[2];

        for (int i = 0; i < 10; i++) {
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetParImpar[0]++;
            } else {
                vetParImpar[1]++;
            }
        }

        System.out.printf("par = %d, impar = %d", vetParImpar[0], vetParImpar[1]);

        sc.close();
    }
}
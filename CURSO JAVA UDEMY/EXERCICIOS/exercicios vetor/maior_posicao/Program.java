// Faça um programa que leia N números reais e armazene-os em um vetor. 
// Em seguida, mostrar na tela o maior número do vetor (supor não haver 
// empates). Mostrar também a posição do maior elemento, considerando a 
// primeira posição como 0 (zero).

package maior_posicao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, posicaoMaior;
        double maiorValor;

        System.out.print("quantos numeros serao digitados? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maiorValor = vetor[0];
        posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoMaior);

        sc.close();
    }
}

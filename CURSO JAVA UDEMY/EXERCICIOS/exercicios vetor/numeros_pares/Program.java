// Faça um programa que leia N números inteiros e armazene-os em um vetor. 
// Em seguida, mostre na tela todos os números pares, e também a quantidade 
// de números pares.

package numeros_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, qntPares;

        System.out.print("quantos numeros serao digitados? ");
        n = sc.nextInt();

        int[] numerosInteiros = new int[n];
        
        
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero inteiro: ");
            numerosInteiros[i] = sc.nextInt();
        }

        System.out.print("numeros pares: ");
        qntPares = 0;
        for(int i = 0; i < n; i++) {
            if(numerosInteiros[i] % 2 == 0) {
                System.out.printf("%d ", numerosInteiros[i]);
                qntPares++;
            }
        }
        System.out.println("quantidade de pares = " + qntPares);

        sc.close();
    }
}

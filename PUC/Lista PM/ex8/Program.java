// Considere a Matriz A abaixo:

// 5 10 7 8
// 13 4 1 3
// 9 2 6 5
// 10 7 4 9

// a) Implemente um algoritmo que exiba a matriz transposta AT
// b) Implemente um algoritmo que exiba a soma dos quadrados da diagonal secundária
// c) Implemente um algoritmo que faça a multiplicação desta matriz por uma constante C
// d) Implemente um algoritmo que inverta a 3ª linha com a 3ª coluna

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int matriz[][] = {
                { 5, 10, 7, 8 },
                { 13, 4, 1, 3 },
                { 9, 2, 6, 5 },
                { 10, 7, 4, 9 }
        };

        // transposta
        int novaMatriz[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                novaMatriz[i][j] = matriz[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }

        // soma dos quadrados
        int somaDiagonal2 = 0;
         System.out.println();
        for (int i = 0; i < 4; i++) {

            int matrizValor = matriz[3 - i][i];
            somaDiagonal2 += (int) Math.pow(matrizValor, 2);

        }
        System.out.print(somaDiagonal2);
         System.out.println();
       
        // multiplicacao

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("digite a constante C: ");
        int constC = sc.nextInt();
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int[][] multiplicacao = new int[4][4];
                int valor = matriz[i][j];
                multiplicacao[i][j] = valor * constC;

                System.out.print(multiplicacao[i][j] + " ");
            }
            System.out.println();

        }

        sc.close();

        // inversao
        for (int i = 0; i < 4; i++) {
            int valorM = matriz[2][i];
            matriz[2][i] = matriz[i][2];
            matriz[i][2] = valorM;
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}

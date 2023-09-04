// fazer um programa para ler um numero inteiro N e a altura de N pessoas. 
// armazene as N alturas em um vetor. em seguida, mostrar a altura media 
// dessas pessoas.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double avg = soma / n;
        System.out.println(avg);

        sc.close();
    }
}
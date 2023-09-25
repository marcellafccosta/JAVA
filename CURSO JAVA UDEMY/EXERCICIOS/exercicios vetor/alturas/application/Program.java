// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver. 

package alturas.application;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.print("quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();

        }

        nmenores = 0;
        alturaTotal = 0;

        for (int i = 0; i < n; i++) {
            if(idades[i] < 16) {
                nmenores++;
            }
            alturaTotal += alturas[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double)nmenores / n) * 100.0;

        System.out.println("altura media = " + alturaMedia);
        System.out.println("pessoas com menos de 16 anos = " + percentualMenores);

        for(int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }


        

        sc.close();
    }
}

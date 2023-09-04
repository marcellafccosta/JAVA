// faca um programa para ler um numero inteiro N e os dados (nome e preco) de
// N produtos. armazene os N produtos em um vetor. em seguida, mostrar preco medio
// dos produtos

package application;

import java.util.Scanner;

import entities.Product;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPrice();
        }

        double avg = soma / n;

        System.out.println(avg);

        sc.close();
    }
}

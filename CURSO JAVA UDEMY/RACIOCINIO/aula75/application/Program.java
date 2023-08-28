package application;

import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insira os dados do produto: ");
        System.out.print("nome: ");
        String name = sc.nextLine();

        System.out.print("preco: ");
        double price = sc.nextDouble();


        Product product = new Product(name, price);

        System.out.println("DADOS DO PRODUTO: " + product);

        System.out.println();
        System.out.print("entre o numero de produtos a serem adicionados no estoque: ");

       int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("DADOS ATUALIZADOS: " + product);

        System.out.println();
        System.out.print("entre o numero de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("DADOS ATUALIZADOS: " + product);

        sc.close();

    }
}
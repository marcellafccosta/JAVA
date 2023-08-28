package application;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

Product product = new Product();
System.out.println("insira os dados do produto: ");
System.out.print("nome: ");
product.name = sc.nextLine();

System.out.print("preco: ");
product.price = sc.nextDouble();

System.out.print("quantidade: ");
product.quantity = sc.nextInt();



System.out.println("DADOS DO PRODUTO: "+ product);

System.out.println();
System.out.print("entre o numero de produtos a serem adicionados no estoque: ");

int quantity = sc.nextInt();
product.addProducts(quantity);

System.out.println("DADOS ATUALIZADOS: "+ product);


System.out.println();
System.out.print("entre o numero de produtos a serem removidos do estoque: ");
quantity = sc.nextInt();
product.removeProducts(quantity);

System.out.println("DADOS ATUALIZADOS: "+ product);




sc.close();

    }
}
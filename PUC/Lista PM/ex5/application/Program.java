// A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados 
// sobre o salário e número de filhos. Faça um método que leia esses dados para um número 
// não determinado de pessoas, calcule e exiba a média de salário da população (a condição 
// de parada pode ser um flag ou a quantidade N). Faça um programa que acione o método.

package application;
import java.util.Scanner;
import entities.Dados;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dados dados = new Dados();

        char opcao;
        do {
            System.out.println("PESQUISA");
            System.out.print("salario: ");
            dados.salario = sc.nextDouble();

            if (dados.salario >= 0) {
                dados.salarioTotal += dados.salario;
                dados.totalPessoas++;

                System.out.print("numero de filhos: ");
                dados.numFilhos = sc.nextInt();
            } else {
                System.out.println("salario negativo. encerrando pesquisa");
                break;
            }

            System.out.println("continuar? (S/N)");
            opcao = sc.next().charAt(0);

        } while (opcao != 'N' && opcao != 'n');


        System.out.printf("media de salario da população: %.2f%n", dados.media());

        sc.close();
    }
}
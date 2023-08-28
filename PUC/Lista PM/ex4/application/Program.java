// Faça um método que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a letra for ‘A’, 
// o procedimento calcula e escreve a média aritmética das notas do aluno, se for ‘P’, calcula e 
// escreve a sua média ponderada (pesos: 5, 3 e 2). Faça um programa que leia 3 notas de N alunos 
// e acione o procedimento para cada aluno (N deve ser lido do teclado).

package application;

import java.util.Scanner;
import entities.Notas;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();

        System.out.print("numero de alunos: ");
        int qntAlunos = sc.nextInt();

        for (int i = 1; i <= qntAlunos; i++) {
        System.out.println("DIGITE AS NOTAS");
        System.out.print("nota 1: ");
        notas.nota1 = sc.nextDouble();
        System.out.print("nota 2: " );
        notas.nota2 = sc.nextDouble();
        System.out.print("nota 3: ");
        notas.nota3 = sc.nextDouble();

        System.out.println("escolha o procedimento (A - MEDIA ARITMETICA OU P - MEDIA PONDERADA: )");
        char opcao = sc.next().charAt(0);

        
            if (opcao == 'A') {
                System.out.printf("media aritmetica: %.2f%n", notas.mediaAritmetica());
            } else if (opcao == 'P') {
                System.out.printf("media ponderada: %.2f%n", notas.mediaPonderada());
            } else {
                System.out.println("opcao invalida");
            }
        }

        sc.close();
    }

}
// Implemente um programa em Java que receba as informações NOME, SEXO e DATA-NASCIMENTO 
// de no mínimo 10 funcionários de uma determinada empresa e apresente como resultados:

// Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os funcionários.
// Ao final do relatório imprimir:
// a quantidade total de funcionários
// a quantidade e o percentual total de funcionários do sexo feminino
// a quantidade e o percentual total de funcionários do sexo masculino
// a idade média geral dos funcionários
// a idade média dos funcionários do sexo feminino
// a idade média dos funcionários do sexo masculino

package application;

import java.util.Scanner;
import entities.Funcionarios;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionarios funcionarios = new Funcionarios();

        System.out.print("Digite a quantidade de funcionários: ");
        funcionarios.qntFuncionarios = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        funcionarios.nome = new String[funcionarios.qntFuncionarios];
        funcionarios.sexo = new String[funcionarios.qntFuncionarios];
        funcionarios.nascimento = new String[funcionarios.qntFuncionarios];
        funcionarios.idade = new String[funcionarios.qntFuncionarios];

        for (int i = 0; i < funcionarios.qntFuncionarios; i++) {

            System.out.printf("funcionario %d: ", i + 1);
            funcionarios.nome[i] = sc.nextLine();

            System.out.print("sexo: ");
            funcionarios.sexo[i] = sc.nextLine();

            System.out.print("data de nascimento: ");
            funcionarios.nascimento[i] = sc.nextLine();

            System.out.print("idade: ");
            funcionarios.idade[i] = sc.nextLine();

        }

        funcionarios.relatorio();
        funcionarios.funcionarios();

        sc.close();
    }
}

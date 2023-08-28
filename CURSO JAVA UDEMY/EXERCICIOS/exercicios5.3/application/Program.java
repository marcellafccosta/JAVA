package application;
import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student student = new Student();
        System.out.print("nome: ");
        student.nome = sc.nextLine();

        System.out.print("insira a nota do primeiro trimestre (0-30): ");
        student.nota1 = sc.nextDouble();

        System.out.print("insira a nota do segundo trimestre (0-35): ");
        student.nota2 = sc.nextDouble();

        System.out.print("insira a nota do terceiro trimestre (0-35): ");
        student.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE: " + student.somatorioNota());
        student.contagemNota();

        sc.close();
    }
}
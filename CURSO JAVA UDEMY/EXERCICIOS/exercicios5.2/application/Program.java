package application;

import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("nome: ");
        employee.name = sc.nextLine();

        System.out.print("salario bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("nome: " + employee.name);
        System.out.println("salario bruto: " + employee.grossSalary);
        System.out.println("imposto: " + employee.tax);
        System.out.println();

        employee.netSalary();

        System.out.println(employee);

        System.out.print("qual a porcentagem do aumento do salario? ");
        double porcentagem = sc.nextDouble();
        employee.increaseSalary(porcentagem);

        System.out.println();
        System.out.println(employee);

        sc.close();
    }

}

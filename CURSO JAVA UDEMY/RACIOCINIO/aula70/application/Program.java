package application;

import java.util.Scanner;

import util.Calculator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("circunferencia: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("valor de pi: %.2f%n", Calculator.PI);


        sc.close();
    }
}
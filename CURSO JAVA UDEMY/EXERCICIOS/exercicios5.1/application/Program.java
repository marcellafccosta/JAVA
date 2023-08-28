package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            Rectangle rectangle = new Rectangle();
            System.out.print("digite o valor da largura: ");
            rectangle.largura = sc.nextDouble();

            System.out.print("digite o valor da altura: ");
            rectangle.altura = sc.nextDouble();

            System.out.println("AREA: " + rectangle.area());
            System.out.println("PERIMETOR: " + rectangle.perimetro());
            System.out.println("DIAGONAL: " + rectangle.diagonal());

            sc.close();
    }
}
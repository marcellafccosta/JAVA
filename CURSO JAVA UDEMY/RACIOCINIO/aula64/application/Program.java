package application;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        // para que o objetivo exista, tem que instancia-lo/cria-lo:
        x = new Triangle();
        y = new Triangle();

        System.out.println("digite as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("digite as medidas do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("area do triangulo X: %.2f%n", areaX);
        System.out.printf("area do triangulo Y: %.2f%n", areaY);

        sc.close();
    }
}

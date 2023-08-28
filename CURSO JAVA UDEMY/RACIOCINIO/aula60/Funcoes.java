import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        mostrarResultado(maior);

        sc.close();

    }

    public static int max(int x, int y, int z) {

        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z && y > x) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void mostrarResultado(int valor) {
        System.out.println("maior = " + valor);
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * //exercicio um
         * Scanner sc = new Scanner(System.in);
         * 
         * int x = sc.nextInt();
         * 
         * for (int i = 1; i <= x; i++) {
         * if (i % 2 != 0) {
         * System.out.println(i);
         * }
         * }
         * 
         * sc.close();
         */

        /*
         * //exercicio dois
         * Scanner sc = new Scanner(System.in);
         * int N = sc.nextInt();
         * int in = 0;
         * int out = 0;
         * for (int i = 0; i < N; i++) {
         * int X = sc.nextInt();
         * 
         * if (X >= 10 && X <= 20) {
         * in++;
         * } else {
         * out++;
         * }
         * 
         * }
         * System.out.println(in + " in");
         * System.out.println(out + " out");
         * 
         * sc.close();
         */

        /*
         * //exercicio tres
         * Scanner sc = new Scanner(System.in);
         * int N = sc.nextInt();
         * 
         * for (int i = 0; i < N; i++) {
         * double a = sc.nextDouble();
         * double b = sc.nextDouble();
         * double c = sc.nextDouble();
         * 
         * double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
         * 
         * System.out.printf("media = %.1f", media);
         * }
         * 
         * 
         * sc.close();
         */

        /*
         * //exercicio quatrp
         * Scanner sc = new Scanner(System.in);
         * int N = sc.nextInt();
         * int a, b;
         * double div;
         * for (int i = 0; i < N; i++) {
         * a = sc.nextInt();
         * b = sc.nextInt();
         * if (b != 0) {
         * div = (double) a / b;
         * System.out.println(div);
         * } else {
         * System.out.println("divisao impossivel");
         * }
         * 
         * }
         * sc.close();
         */

        /*
         * //exercicio cinco
         * Scanner sc = new Scanner(System.in);
         * int N = sc.nextInt();
         * 
         * int fat = 1;
         * 
         * for (int i = 1; i <= N; i++) {
         * fat *= i;
         * }
         * 
         * System.out.println(fat);
         * 
         * sc.close();
         */

        /*
         * //exercicio seis
         * Scanner sc = new Scanner(System.in);
         * 
         * int N = sc.nextInt();
         * for (int i = 1; i <= N; i++) {
         * if (N % i == 0) {
         * System.out.println(i);
         * }
         * }
         * 
         * sc.close();
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int quadrado = 0;
        int cubo = 0;
        int num;

        for (int i = 1; i <= N; i++) {

            num = i;
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d%n", num, quadrado, cubo);

        }

        sc.close();

    }
}

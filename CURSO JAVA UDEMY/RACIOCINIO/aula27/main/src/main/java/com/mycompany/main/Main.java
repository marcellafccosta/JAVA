/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Marcella
 */

/*
Math.sqrt(x) - raiz quadrada de x
Math.pow(x, y)- x elevado a y
Math.abs(x) - valor absoluto de x, sem negativo caso exista

exemplo bhaskara: 
delta = Math.pow(b, 2.0) - 4*a*c;
x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
*/

public class Main {

    public static void main(String[] args) {
        
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("raiz quadrada de " + x + " = " + A);
        System.out.println("raiz quadrada de " + y + " = " + B);
        System.out.println("raiz quadrada de 25 = " + C);
        
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("valor absoluto de " + y + " = " + A);
        System.out.println("valor absoluto de " + z + " = " + B);
    }
}

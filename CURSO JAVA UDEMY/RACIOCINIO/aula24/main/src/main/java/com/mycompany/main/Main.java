/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

/**
 *
 * @author Marcella
 */
public class Main {

    public static void main(String[] args) {

        //exemplo um
        int x, y;

        x = 5;
        y = 2 * x;
        
        System.out.println("exemplo um");
        System.out.println(x);
        System.out.println(y);

        //exemplo dois
        int a;
        double c;

        a = 5;
        c = 2 * a;
        
        System.out.println("exemplo dois");
        System.out.println(a);
        System.out.println(c);

        //exemplo tres
        double b, B, h, area;
        
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        
        System.out.println("exemplo tres");
        System.out.println(area);
        
        
        //exemplo quatro
        int m, n;
        double resultado;
        
        m = 5;
        n = 2;
        
        resultado = (double) m / n; //transformou int em double (Casting)
        
        System.out.println("exemplo quatro");
        System.out.println(resultado);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Marcella
 */


/*
Scanner:
- next()
- nextInt()
- nextDouble()
- next().charAt(0)
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char a;

        String m;
        int n;
        double o;

        String s1, s2, s3;

        //ler uma palavra;
        System.out.println("ler palavra");
        x = sc.next();
        System.out.println("voce digitou: " + x);
        
        //ler um numero inteiro
        System.out.println("ler int");
        y = sc.nextInt();
        System.out.println("voce digitou: " + y);
        
        //ler um numero double
        System.out.println("ler double");
        z = sc.nextDouble();
        System.out.println("voce digitou: " + z);
        
        //ler um caractere
        System.out.println("ler char");
        a = sc.next().charAt(0); //se digitar mais que uma letra, vai pegar a primeira
        System.out.println("voce digitou: " + a);
        
        //ler varios dados na mesma linha
        System.out.println("ler varios dados");
        m = sc.next();
        n = sc.nextInt();
        o = sc.nextDouble();
        System.out.println("dados digitados:");
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        //ler um texto ate a quebra de linha
        System.out.println("digite s1");
        s1 = sc.nextLine(); //pra ler a linha inteira, tem que usar o nextLine
        System.out.println("digite s2");
        s2 = sc.nextLine();
        System.out.println("digite s3");
        s3 = sc.nextLine();

        System.out.println("dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
        sc.close();
    }
}

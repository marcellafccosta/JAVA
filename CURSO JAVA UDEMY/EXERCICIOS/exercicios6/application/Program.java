package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("qual o valor do dolar? ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.print("quantos dolares serao comprados? ");
        CurrencyConverter.quantidade = sc.nextInt();

        
        CurrencyConverter.calculoReais();

        sc.close();
    }
}
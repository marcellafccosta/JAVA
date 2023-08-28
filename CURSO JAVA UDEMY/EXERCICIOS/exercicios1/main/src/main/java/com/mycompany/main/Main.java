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
Scanner sc = new Scanner(System.in);
Scanner:
- sc.next() - ler uma palavra
- sc.nextInt() - ler um inteiro
- sc.nextDouble() - ler um double
- sc.next().charAt(0) - ler um caractere
- sc.nextLine() - ler um texto ate a quebra de linha
sc.close();
 */
public class Main {

    public static void main(String[] args) {

        /*   
//EXERCICIO UM - Faça um programa para ler dois valores inteiros, 
//e depois mostrar na tela a soma desses números com uma mensagem explicativa
        
        Scanner sc = new Scanner(System.in);
        int x, y, soma;

        System.out.println("digite o valor de x:");
        x = sc.nextInt();
        System.out.println("digite o valor de y:");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("soma = " + soma);

        sc.close();*/
 /*
        //EXERCICIO DOIS - Faça um programa para ler o valor do raio de um círculo, 
        //e depois mostrar o valor da área deste círculo com quatro casas decimais
        
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("digite o valor do raio");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("area = %.4f%n", area);

        sc.close();*/
 
 
 /*
        //EXERCICIO TRES - Fazer um programa para ler quatro valores inteiros 
// A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo 
// produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Scanner sc = new Scanner(System.in);
int A, B, C, D, diferenca;

System.out.println("digite o valor de A: ");
A = sc.nextInt();
System.out.println("digite o valor de B: ");
B = sc.nextInt();
System.out.println("digite o valor de C: ");
C = sc.nextInt();
System.out.println("digite o valor de D: ");
D = sc.nextInt();

diferenca = (A * B - C * D);

System.out.printf("diferenca = %d%n", diferenca);


sc.close();
*/
 
 /*
//EXERCICIO QUATRO - Fazer um programa que leia o número de um funcionário, seu 
//número de horas trabalhadas, o valor que recebe por hora e calcula o 
//salário desse funcionário. A seguir, mostre o número e o salário do funcionário, 
//com duas casas decimais.
 
Scanner sc = new Scanner(System.in);

int numFuncionario, numHorasTrabalhadas;
double valorHora, salario;

System.out.println("digite o numero do funcionario: ");
numFuncionario = sc.nextInt();
System.out.println("digite o numero de horas trabalhadas: ");
numHorasTrabalhadas = sc.nextInt();
System.out.println("digite o valor que recebe por hora: ");
valorHora = sc.nextDouble();

salario = numHorasTrabalhadas * valorHora;

System.out.println("numero = " + numFuncionario);
System.out.printf("salario = R$%.2f%n", salario);

sc.close();*/
 
 /*
//EXERCICIO CINCO - Fazer um programa para ler o código de uma peça 1, o número 
//de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de
//peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 
 Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, numPecas1, numPecas2;
        double valorPeca1, valorPeca2, valorPago;

        System.out.println("digite o codigo da peca 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.println("digite o numero de pecas 1: ");
        numPecas1 = sc.nextInt();
        System.out.println("digite o valor da peca 1: ");
        valorPeca1 = sc.nextDouble();

        System.out.println("digite o codigo da peca 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("digite o numero de pecas 2: ");
        numPecas2 = sc.nextInt();
        System.out.println("digite o valor da peca 2: ");
        valorPeca2 = sc.nextDouble();

        valorPago = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;
        System.out.printf("valor a pagar = %.2f", valorPago);

        sc.close();*/
 
 
//EXERCICIO SEIS - Fazer um programa que leia três valores com ponto flutuante 
//de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
 
Scanner sc = new Scanner(System.in);
double A, B, C;
double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

System.out.println("digite o valor de A: ");
A = sc.nextDouble();
System.out.println("digite o valor de B: ");
B = sc.nextDouble();
System.out.println("digite o valor de C: ");
C = sc.nextDouble();

areaTriangulo = (A * C) / 2;
areaCirculo = Math.PI * Math.pow(C, 2);
areaTrapezio = (A + B) * C / 2;
areaQuadrado = B * B;
areaRetangulo = A * B;

System.out.println("triangulo = " + areaTriangulo);
System.out.println("circulo = " + areaCirculo);
System.out.println("trapezio = " + areaTrapezio);
System.out.println("quadrado = " + areaQuadrado);
System.out.println("retangulo = " + areaRetangulo);

sc.close();
    }
}

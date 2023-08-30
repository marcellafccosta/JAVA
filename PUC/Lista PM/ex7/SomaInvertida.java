// Faça uma função que some os valores de dois vetores de tamanho N, ambos recebidos
// por parâmetro, e retorne um outro vetor, também de tamanho N, com o resultado da soma
// dos dois vetores, só que ao contrário.

import java.util.Arrays;

public class SomaInvertida {
    public static int[] somaInvertida(int[] vetor1, int[] vetor2) {
        int tamanho = vetor1.length;
        int[] resultado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = resultado[i];
            resultado[i] = resultado[tamanho - 1 - i];
            resultado[tamanho - 1 - i] = temp;
        }
        return resultado;

    }

    public static void main(String[] args) {

        int[] vetor1 = { 5, 7, 3, 9 };
        int[] vetor2 = { 2, 4, 10, 8 };

        int[] resultado = somaInvertida(vetor1, vetor2);

        System.out.println("Resultado: " + Arrays.toString(resultado));
    }

}
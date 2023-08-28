package entities;

public class Notas {
    public double nota1;
    public double nota2;
    public double nota3;


    public double mediaPonderada() {
        return (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10.0;
    }

    public double mediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3.0;

    }

}

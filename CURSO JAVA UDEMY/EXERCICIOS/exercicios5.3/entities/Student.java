package entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somatorioNota() {
        return nota1 + nota2 + nota3;
    }

    public double faltandoNota() {
        return 60 - somatorioNota();

    }

    public void contagemNota() {

        if (somatorioNota() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");

            System.out.println("MISSING: " + faltandoNota());
        }


    }



}

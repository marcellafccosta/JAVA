package entities;

public class Dados {
    public double salario;
    public int numFilhos;
    public int totalPessoas;
   public double salarioTotal;

    public double media() {
        return salarioTotal / totalPessoas;
    }
    
}

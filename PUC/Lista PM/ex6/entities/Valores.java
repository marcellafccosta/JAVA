package entities;

public class Valores {
    public double valor1;
    public double valor2;
    public double valor3;
    
    public void ordemCrescente(double valor1, double valor2, double valor3) {
        double min = Math.min(Math.min(valor1, valor2), valor3);
        double max = Math.max(Math.max(valor1, valor2), valor3);
        double med = valor1 + valor2 + valor3 - min - max;

       System.out.println(min);
       System.out.println(med);
       System.out.println(max);
    }
}

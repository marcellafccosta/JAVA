package entities;

public class Triangle {
    //public: esses atributos podem ser acessados em outros arquivos
    public double a;
    public double b;
    public double c;


    public double area() {
        double p = (a + b + c) / 2.0;
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
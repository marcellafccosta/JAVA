package util;

public class CurrencyConverter {

    public static double dolar;
    public static int quantidade;
    

    public static void calculoReais() {
        double totalReais = quantidade * dolar * 1.06;

        System.out.print("TOTAL A SER PAGO EM REAIS: " + totalReais);
    }


}

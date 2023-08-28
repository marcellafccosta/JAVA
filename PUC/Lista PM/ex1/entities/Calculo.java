package entities;

public class Calculo {

    public int vetA[] = new int[15];
    public int vetB[] = new int[15];

    public int calculaFat(int num) {
        if (num == 0) {
            return 1;
        } else {
            int fat = 1;
            for (int i = 1; i <= num; i++) {
                fat *= i;
            }
            return fat;
        }
    }
}

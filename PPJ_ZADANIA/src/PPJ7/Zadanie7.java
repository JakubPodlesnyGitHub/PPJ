package PPJ7;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sin;
        double x = in.nextDouble();
        int k = 1, silnia = 1;
        double oldsin, czynik = -Math.pow(x, 2), licznik = x;

        sin = x / k;
        do {
            oldsin = sin;
            licznik = licznik * czynik;
            silnia = silnia * (k + 1) * (k + 2);
            k += 2;
            System.out.println(silnia);
            sin += (licznik / silnia);
            System.out.println(sin);
        } while (Math.abs(sin - oldsin) > 0.00000001);
    }
}

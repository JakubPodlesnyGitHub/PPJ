package PPJ14;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaUz = in.nextInt();
        showBinaryrekurencja(liczbaUz);
        showBinaryiteracja(liczbaUz);
    }

    public static void showBinaryrekurencja(int liczba) {
        if (liczba > 1) {
            showBinaryrekurencja(liczba / 2);
        }
        System.out.print(liczba % 2);
    }

    public static void showBinaryiteracja(int liczba) {
        String wynik = "";
        while (liczba >0) {
            wynik = wynik+ liczba % 2;
            liczba= liczba/ 2;
        }
        System.out.println("\n"+wynik);

    }
}

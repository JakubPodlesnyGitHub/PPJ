package PPJ15;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        convertToOct(liczba);
    }

    public static void convertToOct(int liczba) {
        char[] tab = new char[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char) (liczba % 8 + 48);
            liczba /= 8;

        }
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }

    }
}
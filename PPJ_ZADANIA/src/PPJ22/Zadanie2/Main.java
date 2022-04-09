package PPJ22.Zadanie2;

import PPJ22.Zadanie2.Wyjatki.TablicaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TablicaException {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmiar = in.nextInt();
        wyswietl(tworzenieTablica(rozmiar));
        sprawdzCzySaZera(tworzenieTablica(rozmiar));

    }

    public static int[][] tworzenieTablica(int rozmiar) {
        int[][] tab = new int[rozmiar][rozmiar];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = (int) (Math.random() * (5 - 0 + 1) + 0);
            }
        }
        return tab;
    }

    public static void wyswietl(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    public static void sprawdzCzySaZera(int[][] tablica) throws TablicaException {
        String bledy_pozycje = "";
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (i != j) {
                    if (tablica[i][j] != 0) {
                        bledy_pozycje += "[" + i + "," + j + "]";
                        //
                    }
                }
            }
            System.out.println();
        }
        if (bledy_pozycje != "")
            throw new TablicaException("Tablica na pozycjach" + bledy_pozycje + " nie  spełnia wymagań");
    }
}
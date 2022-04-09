package PPJ14;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char znak = in.next().charAt(0);
        int[][] tab = new int[10][10];
        los(tab);
        System.out.println();
        metodachar(tab, znak);
    }

    public static void metodachar(int[][] tab, char zank) {
        switch (zank) {
            case 'f':
                /*for (int i = 0; i < tab.length; i++) {
                    //tab[i][i] = 1;
                    //tab[i][tab.length - 1 - i] = 1;
                    for (int j = 0; j < tab[i].length; j++) {
                        //System.out.print(tab[i][j] + " ");
                    }
                    System.out.println();
                }*/
            case 's':

            case 'a':
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab[i].length; j++) {
                        System.out.print(tab[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 'r':
                for (int i = tab.length - 1; i >= 0; i--) {
                    for (int j = tab[i].length - 1; j >= 0; j--) {
                        System.out.print(tab[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 'm':
                int min = 0;
                int indexodi = 0;
                int indexodj = 0;
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab[i].length; j++) {
                        if (min > tab[i][j]) {
                            min = tab[i][j];
                            indexodi = i;
                            indexodj = j;
                        }
                    }
                }
                System.out.println("Min: " + min + "\n" + "Wiersz: " + indexodi + "\n" + "Kolumna: " + indexodj);
                break;
            case 'x':
                int max = 0;
                int indexoi = 0;
                int indexoj = 0;
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab[i].length; j++) {
                        if (max < tab[i][j]) {
                            max = tab[i][j];
                            indexoi = i;
                            indexoj = j;
                        }
                    }
                }
                System.out.println("Max: " + max + "\n" + "Wiersz: " + indexoi + "\n" + "Kolumna: " + indexoj);
                break;
            case 'h':
                int suma = 0;
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab[i].length; j++) {
                        suma += tab[i][j];
                    }
                }
                System.out.println("Suma: " + suma);
                break;
            case 't':
                boolean posortowna = true;
                for (int i = 0; i < tab.length - 1; i++) {
                    for (int j = 0; j < tab[i].length - 1; j++) {
                        if (tab[i][j] < tab[i][j + 1]) {
                            posortowna = false;
                        }
                    }
                }
                if (posortowna == true) {
                    System.out.println("Tablica jest posortowana");
                } else {
                    System.out.println("Tablica nie jest posortowna");
                }
        }
    }

    public static void los(int[][] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = (int) (Math.random() * 10);
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

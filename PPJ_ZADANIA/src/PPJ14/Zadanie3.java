package PPJ14;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tab = new int[10];
        int indeks = in.nextInt();
        los(tab);
        tab_ind_podaj(tab,indeks);
    }

    public static void tab_ind_podaj(int[] tab, int indeks) {
        int tmp = 0;
        for (int i = 0; i < tab.length; i++) {
            tmp = tab[indeks];
        }
        System.out.println("\n"+tmp);
    }

    public static void los(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 10);
            System.out.print(tab1[i] + " ; ");
        }
    }
}

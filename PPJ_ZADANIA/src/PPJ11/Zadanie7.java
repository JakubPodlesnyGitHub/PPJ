package PPJ11;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rozmiar = in.nextInt();
        int[] tab = new int[rozmiar];
        los(tab);
        show(tab);
        System.out.println("Po sortowaniu: ");
        //bubleSort(tab);
        insertion_sort(tab);
        show(tab);

    }

    public static void insertion_sort(int[] tab) {
        int min_ind;
        int tmp;
        for (int i = 0; i < tab.length-1; i++) {
            min_ind = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[min_ind] > tab[j])
                    min_ind = j;
                tmp = tab[min_ind];
                tab[min_ind] = tab[i];
                tab[i] = tmp;
            }
        }
    }

    public static void bubleSort(int[] tab) {
        int tmp;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }
        }
    }

    public static void los(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100 + 10);
        }
    }

    public static void show(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}

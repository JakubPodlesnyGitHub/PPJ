package PPJ10;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] tab = new char[3];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            char c = in.next().charAt(0);
            System.out.println(tab[i]);
        }
        for (int i = 1; i < tab.length; i++) {
            if (min>tab[i]) {
                min = tab[i];
            }
        }
        System.out.println(min);
    }
}

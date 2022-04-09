package PPJ10;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] tab = new char[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char) (Math.random() * 26 + 65);
            System.out.println("\n"+tab[i]);
        }

        int suma = 5;
        do {
            int licznik = 0;
            char c = in.next().charAt(0);
            for (int i = 0; i < tab.length; i++) {
                if (c == tab[i]) {
                    licznik++;
                    suma--;
                    tab[i]='0';
                }
            }
            System.out.println(licznik);
        }while (suma !=0);
    }
}

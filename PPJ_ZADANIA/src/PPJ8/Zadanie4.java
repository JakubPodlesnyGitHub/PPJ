package PPJ8;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wynik = 0;
        int liczba1 = 0;
        int i = 0;
        do {
            liczba1 = in.nextInt();
            if (i % 2 == 0) {
                wynik += liczba1;
                System.out.println("Obecny wynik: " + wynik);
            } else if (i % 2 != 0) {
                wynik -= liczba1;
                System.out.println("Obecny wynik: " + wynik);
            }
            i++;
        } while (liczba1 != 0);
        System.out.println("Program zakończył się bo podałeś 0");
    }
}

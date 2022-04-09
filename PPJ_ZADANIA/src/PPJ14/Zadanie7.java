package PPJ14;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaprzezUz = in.nextInt();
        show_parzyste(liczbaprzezUz);
        System.out.println("-------------------------------");
        show_nieparzyste(liczbaprzezUz);
    }

    public static void show_parzyste(int liczba) {
        if (liczba > 0) {
            if (liczba % 2 == 0) {
                System.out.println(liczba + ",");
                liczba--;
                show_parzyste(liczba);
            }else{
                show_parzyste(--liczba);
            }
        }
    }
    public static void show_nieparzyste(int liczba) {
        if (liczba > 0) {
            if (liczba % 2 != 0) {
                System.out.println(liczba + ",");
                liczba--;
                show_nieparzyste(liczba);
            }else{
                show_nieparzyste(--liczba);
            }
        }
    }
}

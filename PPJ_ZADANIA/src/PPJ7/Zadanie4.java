package PPJ7;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        while (liczba > 0) {
            System.out.println("0 po podaniu liczby na -");
            liczba--;
        }
        do {
            System.out.println("1 po podaniu liczby na -");
        } while (liczba > 0);
    }
}

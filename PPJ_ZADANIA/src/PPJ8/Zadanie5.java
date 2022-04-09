package PPJ8;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fib1 = 1;
        int fib2 = 1;
        int wynikfib = 0;
        int liczbaFibPrzezUzyt = in.nextInt();
        System.out.println(1);
        while (wynikfib <= liczbaFibPrzezUzyt) {
            wynikfib = fib1 + fib2;
            fib1 = fib2;
            fib2 = wynikfib;
            System.out.println(fib1);
        }
    }
}

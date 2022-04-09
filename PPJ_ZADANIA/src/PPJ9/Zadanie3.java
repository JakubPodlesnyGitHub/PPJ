package PPJ9;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zmienną: ");
        int zmiennaPrzezUzytkownika = in.nextInt();
        String wynik = "";
        while (zmiennaPrzezUzytkownika != 0) {
            wynik = (zmiennaPrzezUzytkownika & 0b11) + wynik;
            zmiennaPrzezUzytkownika = zmiennaPrzezUzytkownika >> 2;
        }
        System.out.println(wynik);
    }
}

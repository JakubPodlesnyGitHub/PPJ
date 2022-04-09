package PPJ14;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaOdUzytkownika = in.nextInt();
        show_rekurencja(liczbaOdUzytkownika);
    }
    public static void show_rekurencja(int liczba){
        System.out.println(liczba+", ");
        if(liczba>0)
            show_rekurencja(--liczba);

    }
}

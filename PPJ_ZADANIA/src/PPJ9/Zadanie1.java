package PPJ9;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char chr = 'C';
        if (chr >= 'A' && chr <= 'G') {
            System.out.println("A-G");
        } else if (chr >= 'H' && chr <= 'Z') {
            System.out.println("H-Z");
        }
    }
}
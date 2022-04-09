package PPJ8;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int podzielnik = in.nextInt();
        int zakresA = in.nextInt();
        int zakresB = in.nextInt();
        for (int i = zakresA; i < zakresB; i++) {
            if (i % podzielnik == 0)
                System.out.println(i);
        }
    }
}

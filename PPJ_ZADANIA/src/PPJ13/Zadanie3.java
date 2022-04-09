package PPJ13;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        findMax(x, y, z);
    }

    public static void findMax(int x1, int x2, int x3) {
        if (x1 > x2 && x1 > x3) {
            System.out.println(x1 + "MAX");
        } else if (x2 > x1 && x2 > x3) {
            System.out.println(x2 + "MAX");
        } else {
            System.out.println(x3 + "MAX");
        }
    }
}

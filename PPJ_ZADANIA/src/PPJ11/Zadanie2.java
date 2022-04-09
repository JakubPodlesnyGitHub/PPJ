package PPJ11;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] tab = new int[n][n];
        for (int i = 0; i < tab.length; i++) {
            tab[i][i] = 1;
            tab[i][tab.length-1-i]=1;
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}

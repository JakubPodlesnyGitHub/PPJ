package PPJ14;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        int numerbitu = in.nextInt();
        showBinary(liczba,numerbitu);

    }

    public static void showBinary(int liczba, int bit_zanku) {
        int i = 0;
        int[] tab = new int[31];
        while (liczba != 0) {
            tab[i++] = liczba % 2;
            liczba /= 2;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(tab[j]+" ");

        for( i=1;i<tab.length;i++){
            if(i == bit_zanku){
                System.out.println("\n"+tab[i]);
            }
        }
    }
}

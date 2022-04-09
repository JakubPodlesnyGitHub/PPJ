package PPJ11;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zakres_koncowy = in.nextInt();
        boolean [] tab = new boolean[zakres_koncowy];
        tab = new boolean[zakres_koncowy+1];
        for(int i = 2;i<zakres_koncowy;i++){
            tab[i]=false;
        }
        sito(tab,zakres_koncowy);
        for(int i = 2;i<zakres_koncowy;i++){
            if(!(tab[i])){
                System.out.println(i + " ");
            }
        }
    }

    public static void sito(boolean tab[], int n) {
        for (int i = 2; i * i <= n; i++) {
            if (!tab[i])
                for (int j = i * i; j <= n; j += i)
                    tab[j] = true;
        }
    }
}

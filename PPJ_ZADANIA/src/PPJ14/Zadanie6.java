package PPJ14;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczbaUz = in.nextInt();
        System.out.println(silnia_rekurencyjnie(liczbaUz));
        silnia_interacyjnie(liczbaUz);
    }
    public static int silnia_rekurencyjnie(int liczba){
        if(liczba<=1)
            return 1;
        return liczba * silnia_rekurencyjnie(liczba-1);
    }
    public static void silnia_interacyjnie(int liczba){
        int silnia=1;
        for(int i=1;i<=liczba;i++){
            silnia *= i;
        }
        System.out.println(silnia);
    }
}

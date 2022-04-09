package PPJ11;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rozmiarTab1 = in.nextInt();
        int rozmiarTab2 = in.nextInt();
        int[][] tab1 = new int[rozmiarTab1][rozmiarTab1];
        int[][] tab2 = new int[rozmiarTab2][rozmiarTab2];
        int[][] tab3 = new int[rozmiarTab2][rozmiarTab2];
        //losowanie 1 tablicy
        for(int i=0;i<tab1.length;i++){
            for(int j =0;j<tab1[i].length;j++){
                tab1[i][j] = (int)(Math.random()*20);
            }
        }
        //losowanie 2 tablicy
        for(int i=0;i<tab2.length;i++){
            for(int j =0;j<tab2[i].length;j++){
                tab2[i][j] = (int)(Math.random()*30);
            }
        }
        System.out.println("TAB 1");
        for(int i=0;i<tab1.length;i++){
            for(int j =0;j<tab1[i].length;j++){
                System.out.print(tab1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("TAB 2");
        for(int i=0;i<tab2.length;i++){
            for(int j =0;j<tab2[i].length;j++){
                System.out.print(tab2[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<tab2.length;i++){
            for(int j =0;j<tab2[i].length;j++){
                tab3[i][j]+=tab2[i][j];
            }
        }
        for(int i=0;i<tab1.length;i++){
            for (int j=0;j<tab1.length;j++){
                tab3[i][j] += tab1[i][j];
            }
        }

        System.out.println("TAB 3");
        for(int i=0;i<tab2.length;i++){
            for(int j =0;j<tab2[i].length;j++){
                System.out.print(tab3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

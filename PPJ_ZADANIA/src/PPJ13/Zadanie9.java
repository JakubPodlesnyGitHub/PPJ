package PPJ13;
import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        do {
            x = in.nextInt();
            y = in.nextInt();
        } while (x < 0 || y < 0);
        int[][] tab = new int[x][y];
        /*los(tab);
        display(tab);
        fillRow(tab, 3, 1);
        System.out.println();
        display(tab);
        fillCol(tab,3,2);
        System.out.println();
        display(tab);
        System.out.println();
        fillRow(tab,3,2,4,-1);
        display(tab);*/
        System.out.println("Spirala");
        zeroSlimak(tab);
        display(tab);
        fillCol(tab,0,1);
        display(tab);
        fillRow(tab,tab.length-1,1);
        System.out.println();
        display(tab);
        System.out.println();
        fillCol(tab,tab[0].length-1,1,tab.length-2,1);
        display(tab);
        System.out.println();
        fillRow(tab,1,2,tab.length-1,1);
        System.out.println();
        display(tab);
        fillCol(tab,2,1,tab.length-3,1);
        System.out.println();
        display(tab);

    }

    public static void los(int[][] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void zeroSlimak(int[][] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = 0;
            }
        }
    }

    public static void display(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillRow(int[][] tab, int row, int val) {
        if (row >= 0 || row < tab.length) {
            for (int i = 0; i < tab[row].length; i++) {
                tab[row][i] = val;
            }
        }
    }
    public static void fillCol(int[][] tab, int col, int val) {
        if (col >= 0 || col < tab[0].length) {
            for(int i=0;i<tab.length;i++){
                tab[i][col] = val;
            }
        }
    }

    public static void fillRow(int[][] tab, int row, int from, int to, int val) {
        if (row >= 0 || row < tab.length) {
            for (int i = from; i <tab[row].length && i<=to; i++) {
                tab[row][i] = val;
            }
        }
    }
    public static void fillCol(int[][] tab, int col, int from, int to, int val) {
        if (col >= 0 || col < tab[0].length) {
            for(int i=from;i<tab.length && i<=to;i++){
                tab[i][col] = val;
            }
        }
    }
}

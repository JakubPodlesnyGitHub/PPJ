package PPJ13;
import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rozmiary tablic");
        int rozmiar1 = in.nextInt();
        int rozmiar2 = in.nextInt();
        int rozmiar3 = in.nextInt();
        int rozmiar4 = in.nextInt();
        int[][] tab1 = new int[rozmiar1][rozmiar2];
        int[][] tab2 = new int[rozmiar3][rozmiar4];
        System.out.println(jestRowna(tab1,tab2));
    }

    public static boolean jestRowna(int[][] tab1, int[][] tab2) {
        for(int i=0;i<tab1.length;i++){
            for(int j =0;j<tab2[i].length;j++){
                tab1[i][j] = (int)(Math.random()*5);
                tab2[i][j] = (int)(Math.random()*5);
            }
        }
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length ; j++) {
                if(tab1.length == tab2.length && tab1[i][j] == tab2[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}

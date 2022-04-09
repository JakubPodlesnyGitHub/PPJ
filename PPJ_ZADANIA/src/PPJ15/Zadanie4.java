package PPJ15;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println(showRectangleArea(get2size()));
    }
    public static int[] get2size(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int [] tab = new int[2];
        tab[0] = a;
        tab[1] = b;
        return tab;
    }
    public static int showRectangleArea(int [] tab){
        return tab[0] *tab[1];
    }
}

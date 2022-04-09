package PPJ13;
import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        System.out.println("PODAJ WARTOSC");
        int x = in.nextInt();
        System.out.println("Tablica 1");
        los(tab1);
        System.out.println("\nTablica 2");
        los(tab2);
        tablice(tab1,tab2,x);

    }

    public static void los(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (char) (Math.random() * (10 - 1 + 1) + 1);
            System.out.print(tab1[i] + ";");
        }
    }

    public static void tablice(int[] tab1, int[] tab2, int x) {
        int[] tabzwracana = new int[10];
        if (x < 0) {
            System.out.println("\nSuma na tych samych indeksach");
            for (int i = 0; i < tabzwracana.length; i++) {
                tabzwracana[i] += (tab1[i] + tab2[i]);
                System.out.println(tabzwracana[i]+ ";");
            }
        }else{
            for (int i = 0; i < tabzwracana.length; i++) {
                tabzwracana[i] += (tab1[i] + tab2[i]);
            }
        }
    }
}

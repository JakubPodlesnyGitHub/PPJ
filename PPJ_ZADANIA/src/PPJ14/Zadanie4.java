package PPJ14;

public class Zadanie4 {
    public static void main(String[] args) {
        int [] tab = new int[10];
        los(tab);
        System.out.println();
        show_tablica(tab,5);
    }
    public static void show_tablica(int [] tablica,int i){
        i = i;
        System.out.println(tablica[i]+", ");
        if(i>0)
            show_tablica(tablica,i-1);

    }
    public static void los(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 10);
            System.out.print(tab1[i] + " ; ");
        }
    }
}

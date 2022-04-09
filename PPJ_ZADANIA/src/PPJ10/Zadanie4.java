package PPJ10;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tab = new int[(int) (Math.random() * 6 + 10)];
        //1
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            System.out.print(tab[i] + " ; ");
        }
        System.out.println();
        //2

        for (int i = 0; i < 50; i++) {
            int x = (int) (Math.random() * tab.length);
            int y = (int) (Math.random() * tab.length);
            if (x != y) {
                tab[x] = tab[x] + tab[y];
                tab[y] = tab[y] - tab[x];
                tab[x] = tab[x] - tab[y];
            }
        }
        //3

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ; ");
        }
        System.out.println();

        /*for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; i++) {
                System.out.print(i == tab[j] ? " * " : " . ");
            }
            System.out.println();
        }*/
    }
}

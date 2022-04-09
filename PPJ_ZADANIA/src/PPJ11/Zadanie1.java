package PPJ11;

public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        int tmp;
        //sladan
        /*for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * (50 - (-30) + 1)) - 30;
            System.out.print(tab1[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < 5 * tab1.length; i++) {
            int i1 = (int) (Math.random() * tab1.length);
            int i2 = (int) (Math.random() * tab1.length);

            if (i1 != i2) {
                tmp = tab1[i1];
                tab1[i1] = tab1[i2];
                tab1[i2] = tmp;
            } else {
                i--;
            }
        }
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " , ");

        }
        System.out.println();

        for (int i = 0; i < tab1.length / 2; i += 2) {
            tmp = tab1[tab1.length - 1 - i];
            tab1[tab1.length - 1 - i] = tab1[i];
            tab1[i] = tmp;
        }
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " , ");

        }
        System.out.println();*/
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 81 - 30);
            System.out.print(tab1[i] + " , ");
            Wypisz(tab1);
            Mieszanie(tab1);
            System.out.println("Tablica po mieszaniu");
            Wypisz(tab1);
            Zamiana(tab1);
            System.out.println("Tablica po zamianie");
            Wypisz(tab1);
        }
    }

    public static void Wypisz(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ; ");
        }
        System.out.println();
    }

    public static void Mieszanie(int[] tab) {
        int x = (int) (Math.random() * tab.length);
        int y = (int) (Math.random() * tab.length);
        if (x != y) {
            tab[x] = tab[x] + tab[y];
            tab[y] = tab[x] - tab[y];
            tab[x] = tab[x] - tab[y];
        }
    }

    public static void Zamiana(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + tab[tab.length-1-i];
            tab[tab.length-1-i] = tab[i] - tab[tab.length-1-i];
            tab[i] = tab[i] - tab[tab.length-1-i];
        }
    }
}

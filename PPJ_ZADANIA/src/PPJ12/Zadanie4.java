package PPJ12;

public class Zadanie4 {
    public static void main(String[] args) {
        byte[] tab = new byte[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (byte) (Math.random() * (5 - 0 + 1) + 0);
            System.out.println(tab[i]);
        }
        int parzyste = 0, nieparzyte = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parzyste++;
            } else {
                nieparzyte++;
            }
        }
        System.out.println("///////////////");
        System.out.println(parzyste);
        System.out.println(nieparzyte);
        System.out.println("/////////////////");
        byte[] tabparzyte = new byte[parzyste];
        byte[] tabnieparzyte = new byte[nieparzyte];
        byte p = 0, np = 0;
        for (byte i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                tab[p] = tab[i];
                p++;
            } else {
                tab[np] = tab[i];
                np++;
            }
        }
        System.out.println("Tablica parzysta");
        for (int i = 0; i < tabparzyte.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println("Tablica nieparzysta");
        for (int i = 0; i < tabnieparzyte.length; i++) {
            System.out.println(tab[i]);
        }

    }
}

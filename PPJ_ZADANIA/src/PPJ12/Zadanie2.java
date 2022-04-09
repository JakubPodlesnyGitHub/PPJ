package PPJ12;

public class Zadanie2 {
    public static void main(String[] args) {
        int [] tab = new int[]{1,2,3,4,4,3,2,1};
        System.out.println(palindrom(tab));
    }

    public static boolean palindrom(int[] tab) {
        int i = 0;
        int j = tab.length - 1;
        boolean wynik = true;
        while (i <= j) {
            if (tab[i] != tab[j]) {
                return false;
            }
            ++i;
            --j;

        }
        return true;
    }
}

package PPJ15;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        los(tab);
        wypelnienie2(tab);
    }

    public static void los(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (100 - 0 + 1) + 0);
            System.out.print(tab[i] + " ");
        }
    }
    public static void wypelnienie2(int[] tab){
        double srednia = 0;
        int[] tab2 = new int[10];
        for (int i = 0; i < tab.length; i++){
            srednia += tab[i];
        }
        srednia/=10;

        for(int i =0;i<tab.length;i++){
            if(tab[i]>srednia){
                tab[i] = tab2[i];
            }
        }
        for(int i =0;i<tab.length;i++){

            tab2[i] = tab[i];
        }
    }
}

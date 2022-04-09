package PPJ14;

public class Zadanie8 {
    public static void main(String[] args) {
        int[] tab = new int[8];
        los(tab);
        System.out.println();
        convertFromBinary(tab);
    }

    public static void los(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 2);
            System.out.print(tab1[i] + " ");
        }
    }

    public static void convertFromBinary(int[] tab) {
        int dziesietne=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i] == 1){
                dziesietne += (int)(Math.pow(2,tab.length-i));
            }
        }
        dziesietne /= 2;
        System.out.println(dziesietne);
    }
}

package PPJ13;

public class Zadanie8 {
    public static void main(String[] args) {
        int n = 25;
        int[][] tab = new int[n][n];
        los(tab);
        /*tab[0][1]=1;
        tab[0][2]=1;
        tab[1][2]=1;
        tab[1][0]=0;
        tab[2][0]=0;
        tab[2][1]=0;*/
        //show(tab);
        znajdywanie(tab);
    }
    /*public static void show(int [][] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }*/
    public static void los(int[][] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                tab1[i][j] = (int) (Math.random() * 2 + 0);
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void znajdywanie(int[][] tab) {
        for (int n = 3; n <= 25; n += 2) {
            for (int i = 0; i < tab.length - (n - 1); i++) {
                for (int j = 0; j < tab[i].length - (n - 1); j++) {
                    System.out.println(check(tab,n,i,j));
                }
            }
        }
    }
    public static boolean check(int [][] tab, int n,int w, int k){

        for(int i = 0 ;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(tab[i+w][j+k] != 1){
                    return false;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(tab[i+w][j+k] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}

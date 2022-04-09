package PPJ15;

public class Zadanie2 {
    public static void main(String[] args) {
        char[][] tab = new char[5][5];
        los(tab);
        sprawdzanie(tab);
    }

    public static void los(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (char) (Math.random() * ('z' - 'a' + 1) + 'a');
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sprawdzanie(char[][] tab){
        for(int i =0;i<tab.length-1;i++){
            for(int j =0;j<tab[i].length-1;j++){
                if((tab[1][j] > tab[1][j+1]) || tab[i][1] > tab[i+1][j]){
                    System.out.println("tak");
                }
                else if((tab[1][j] < tab[1][j+1]) || (tab[i][1] < tab[i+1][j])){
                    System.out.println("tak");
                }
            }
        }
    }
}

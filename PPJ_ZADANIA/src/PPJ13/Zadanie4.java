package PPJ13;

public class Zadanie4 {
    public static void main(String[] args) {
        char[] tab = new char[]{'a','l','a','m','a','k','o','t','a'};
        zlicznie(tab);
    }
    public static void zlicznie(char tab[]){
        int licznik =0;
        for(char i='a';i<'z';i++){
            for(int j =0;j< tab.length;j++){
                if (i == tab[j]){
                    licznik++;
                }
            }
            if(licznik >0){
                System.out.println(i+" = "+licznik);
            }
            licznik =0;
        }
    }
}

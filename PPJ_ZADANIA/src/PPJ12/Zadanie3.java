package PPJ12;

public class Zadanie3 {
    public static void main(String[] args) {
        char [] tablica = new char[10];
        for(int i =0;i<tablica.length;i++){
            tablica[i] = (char)(Math.random()*('z'-'a'+1)+'a');
            System.out.println(tablica[i]);
        }
        int licznik =0;
        for(char i='a';i<'z';i++){
            for(int j =0;j< tablica.length;j++){
                if (i == tablica[j]){
                    licznik++;
                }
            }
            if(licznik >0){
                System.out.println(i+" "+licznik);
            }
            licznik =0;
        }
    }
}

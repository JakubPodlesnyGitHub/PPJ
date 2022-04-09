package PPJ12;

public class Zadanie1 {
    public static void main(String[] args) {
        char [] tablica = new char[10];
        for(int i =0;i<tablica.length;i++){
            tablica[i] = (char)(Math.random()*('z'-'a'+1)+'a');
            System.out.println(tablica[i]);
        }
        char tmp;
        int y = tablica.length-1;
        System.out.println("Tablica po odwróceniu");
        for(int i =0;i<tablica.length/2;i++){
            tmp = tablica[i];
            tablica[i]= tablica[y];
            tablica[y]=tablica[i];
            y--;
        }
        for(int i =0 ;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
    }
}

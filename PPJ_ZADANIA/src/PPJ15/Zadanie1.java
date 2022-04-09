package PPJ15;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wielkosc = in.nextInt();
        char znak = in.next().charAt(0);
        wypelnianie(znak,wielkosc);

    }
    public static void wypelnianie(char znak,int wielkosc){
        for(int i=0;i<wielkosc;i++){
            for(int j=0;j<wielkosc;j++){
                if(znak == 'x'){
                    System.out.print(znak+" ");
                    znak = 'o';

                }else if(znak=='o'){
                    System.out.print(znak+" ");
                    znak = 'x';

                }
            }
            System.out.println();
        }
    }
}

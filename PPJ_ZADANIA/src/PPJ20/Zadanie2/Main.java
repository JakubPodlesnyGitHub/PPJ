package PPJ20.Zadanie2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Figura(Color.black,"Figura");
        Kwadrat k1 = new Kwadrat(Color.gray,5,"Kwadrat");
        Kwadrat k2 = new Kwadrat(Color.blue,10,"Kwadrat");
        Prostokat p1 = new Prostokat(Color.cyan,4,10,"Prostokat");
        Prostokat p2 = new Prostokat(Color.magenta,2,8,"Prostokat");
        Trojkat t1 = new Trojkat(Color.cyan,10,4,9,"Trojkat");
        Kolo ko1 = new Kolo(Color.black,10,"Koło");
        System.out.println("////////////////////////////////////////");
        Figura[] tab = new Figura[6];
        tab[0]=k1;
        tab[1]=k2;
        tab[2]=p1;
        tab[3]=p2;
        tab[4]=ko1;
        tab[5]=t1;
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
}

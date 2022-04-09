package PPJ19;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("////////////////////1////////////////////");
        Kwadrat k1 = new Kwadrat(10);
        k1.show();
        System.out.println("//////////////////////2//////////////////");
        Walec w1 = new Walec(5, 10);
        w1.show();
        System.out.println("//////////////////3//////////////////");
        //KulaW kw1 = new KulaW(15);
        //kw1.show();
        System.out.println();
        //KulaNa kn1 = new KulaNa(15);
        //kn1.show();
        System.out.println("////////////////////4//////////////////");
        Osoba o1 = new Osoba("Adam", 1999);
        Osoba o2 = new Osoba("Jan");
        Osoba o3 = new Osoba("Krzysztof", 1980);

        System.out.println(Osoba.zwrocStarszaOsobe(o1, o2));

        Osoba[] tab = {o1, o2, o3};
        System.out.println(Osoba.zwrocNajStarszaOsobe(tab));
        System.out.println("//////////////////////5/////////////////");
        Owoc ow1 = new Owoc("jabłko");
        Owoc ow2 = new Owoc("truskawka");
        Owoc ow3 = new Owoc("gruszka");
        ow1.wypisz();
        ow2.wypisz();
        ow3.wypisz();
        System.out.println("///////////////////6////////////////////");
        Dzem d1 = new Dzem("truskawkowy");
        Dzem d2 = new Dzem(80.0);
        Dzem d3 = new Dzem("morelowy", 50.0);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("/////////////////////7//////////////////");
        Sloik sloik = new Sloik(d1);
        System.out.println(sloik);
        System.out.println("//////////////////////8/////////////////");
        Telefon telefon = new Telefon("5g", Color.BLUE);
        telefon.zadzwon("123456789");
        System.out.println("////////////////////////9///////////////");
        Komorka komorka = new Komorka("gmm", Color.BLACK);
        for (int i = 0; i < 10; i++)
            komorka.zadzwon(String.valueOf(i));

        komorka.wyswietlHistoriePolaczen();
        System.out.println("///////////////////////10////////////////////////");
        Osoba2 osoba2a = new Osoba2("Jan", "Kowalski", "1");
        Osoba2 osoba2b = new Osoba2("Adam", "Nowak", "3");
        Osoba2 osoba2c= new Osoba2("Krzysztof", "Kwiatkowski", "5");
        Osoba2 osoba2d = new Osoba2("Elżbieta", "Nowak", "7");
        Osoba2 osoba2e = new Osoba2("Izabela", "Kwiat", "9");
        System.out.println("//////////////////11/////////////////////////////");
        Smartfon s1 = new Smartfon("5G", Color.red);
        s1.dodajZnajomy(osoba2a);
        s1.dodajZnajomy(osoba2b);
        s1.dodajZnajomy(osoba2c);
        s1.dodajZnajomy(osoba2d);
        s1.dodajZnajomy(osoba2e);
        for (int i = 0; i < 10; i++)
            s1.zadzwon(String.valueOf(i));
        System.out.println("/////////////////////12//////////////////////////");
        telefon.wyswietlHistoriaPoloczen();
        komorka.wyswietlHistoriaPoloczen();
        s1.wywietlHistoriePoloczen();
    }
}

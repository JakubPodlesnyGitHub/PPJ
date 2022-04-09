package PPJ18;

public class Main {
    public static void main(String[] args) {
        Kwadrat k1 = new Kwadrat(10);
        k1.show();
        Walec w1 = new Walec(10, 5);
        w1.show();
        Wyraz slowo1 = new Wyraz();
        for (int i = 0; i < 10; i++) {
            slowo1.dodajZnak('a');
        }
        System.out.println(slowo1.length());
        slowo1.wyswietl();
        System.out.println();
        Osiol osiol = new Osiol(0.1);

        while (!osiol.czyLata()) {
            Balon b1 = new Balon();
            System.out.println("balon: " + b1.podajUdzwig());
            osiol.dodajBalon(b1);
        }
        if(osiol.czyLata()== true) {
            System.out.println("Ja latam!!!");
        }
        Wyraz wyraz = new Wyraz();
        for (int i = 0; i < 1000; i++) {
            wyraz.dodajZnak('a');
        }
    }
}

package PPJ19;

import java.awt.*;

public class Smartfon extends Komorka {
    private Osoba2[] znajomi;

    public Smartfon(String interfejsKomunikacyjny, Color color) {
        super(interfejsKomunikacyjny, color);
        znajomi = new Osoba2[0];
    }

    public void dodajZnajomy(Osoba2 osoba) {
        Osoba2[] tab1 = new Osoba2[znajomi.length + 1];
        for (int i = 0; i < znajomi.length; i++) {
            tab1[i] = znajomi[i];
        }
        tab1[znajomi.length] = osoba;
        tab1 = znajomi;
    }

    public void wywietlHistoriePoloczen() {
        for (int i = index - 1; i > 0; i--) {
            Osoba2 tmp = null;
            for (int j = 0; j < znajomi.length; j++) {
                if (tab[i] != null && tab[i].equals(znajomi[j].getNumer())) {
                    tmp = znajomi[j];
                }
                if (tmp != null) {
                    System.out.println(tmp);
                } else {
                    System.out.println(tab[i]);
                }
            }
        }
        for (int i = tab.length - 1; i >= index; i--) {
            Osoba2 tmp = null;
            for (int j = 0; j < znajomi.length; j++)
                if (tab[i] != null && tab[i].equals(znajomi[j].getNumer()))
                    tmp = znajomi[j];
            if (tmp != null)
                System.out.println(tmp);
            else
                System.out.println(tab[i]);
        }
    }
}


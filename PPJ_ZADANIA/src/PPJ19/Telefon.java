package PPJ19;

import java.awt.*;

public class Telefon {
    private String interfejsKomunikacyjny;
    private Color color;

    public Telefon(String interfejsKomunikacyjny, Color color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer) {
        System.out.println(numer);
    }

    public void wyswietlHistoriaPoloczen() {
        System.out.println("barak histori poloczen");
    }
}

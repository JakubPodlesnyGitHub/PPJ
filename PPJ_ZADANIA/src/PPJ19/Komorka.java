package PPJ19;
import java.awt.*;
public class Komorka extends Telefon {
    protected String[] tab;
    protected int index = 0;

    public Komorka(String interfejsKomunikacyjny, Color color) {
        super(interfejsKomunikacyjny, color);
        tab = new String[10];
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
        tab[index++] = numer;
        if (index == tab.length)
            index = 0;
    }

    public void wyswietlHistoriePolaczen() {
        for (int i = index - 1; i > 0; i--)
            System.out.println(tab[i]);

        for (int i = tab.length - 1; i >= index; i--)
            System.out.println(tab[i]);
    }
}

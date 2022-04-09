package PPJ18;

public class Osiol {
    private double masa;
    private Balon[] tab;
    private int iloscelEmentow;
    private double udzwig;

    public Osiol(double masa) {
        this.masa = masa;
        tab = new Balon[0];
        iloscelEmentow = 0;
    }

    public void dodajBalon(Balon b1) {
        if (iloscelEmentow >= tab.length) {
            Balon[] tab2 = new Balon[iloscelEmentow + 1];
            for (int i = 0; i < tab.length; i++) {
                tab2[i] = tab[i];
            }
            tab = tab2;
        }

        tab[iloscelEmentow++] = b1;
        udzwig += masa;
    }
    public boolean czyLata()
    {
        return udzwig > masa;
    }
}

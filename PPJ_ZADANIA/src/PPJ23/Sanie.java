package PPJ23;


import PPJ23.Wyjatki.GrinchException;
import PPJ23.Wyjatki.SpadajaceSanieException;

public class Sanie {
    private int miejsceMikolaja;
    private int przebytyDystans;
    private double wysokosc;
    private int zapasPylu;
    private Prezent[] prezenty;

    public Sanie(int miejsceMikolaja, int przebytyDystans, int wysokosc, int zapasPylu, Prezent[] prezenty) {
        this.miejsceMikolaja = miejsceMikolaja;
        this.przebytyDystans = przebytyDystans;
        this.wysokosc = wysokosc;
        this.zapasPylu = zapasPylu;
        this.prezenty = prezenty;
    }

    public void lec() throws SpadajaceSanieException, GrinchException {
        przebytyDystans += 1;
        zapasPylu += 10;
        if (przebytyDystans % 5 == 0) {
            zapasPylu -= 125;
            if (zapasPylu <= 0) {
                wysokosc -= 0.05;
                zapasPylu += 10;
                throw new SpadajaceSanieException("Wysokosć na jakiej znajdują sie sanie: " + wysokosc);
            }
        }
        if (wysokosc <= 0) {
            throw new GrinchException("Świąt w tym roku nie będzie");
        }
        if (wysokosc < 3) {
            wysokosc += 0.02;
        }
    }

}

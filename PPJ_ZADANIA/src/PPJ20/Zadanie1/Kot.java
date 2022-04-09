package PPJ20.Zadanie1;

public class Kot extends Zwierze {
    private int wielkoscPazorow;
    private int wielkoscGlowy;


    public Kot(String name, Osoba wlasiciel,int wielkoscPazorow,int wielkoscGlowy) {
        super(name, wlasiciel);
        this.wielkoscPazorow = wielkoscPazorow;
        this.wielkoscGlowy = wielkoscGlowy;
    }

    public void setWielkoscGlowy(int wielkoscGlowy) {
        this.wielkoscGlowy = wielkoscGlowy;
    }

    public void setWielkoscPazorow(int wielkoscPazorow) {
        this.wielkoscPazorow = wielkoscPazorow;
    }

    public int getWielkoscGlowy() {
        return wielkoscGlowy;
    }

    public int getWielkoscPazorow() {
        return wielkoscPazorow;
    }

    @Override
    public String toString() {
        return super.toString() + "Kot "+ "wielkoscPazorow: " + wielkoscPazorow + "wielkoscGlowy: "+ wielkoscGlowy;
    }
}

package PPJ19;

public class Osoba2 {
    private String imie;
    private String Nazwisko;
    private String numer;

    public Osoba2(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.Nazwisko = nazwisko;
        this.numer = numer;
    }
    @Override
    public String toString() {
        return imie + " " + Nazwisko + " " + getNumer();
    }

    public String getNumer() {
        return numer;
    }

}

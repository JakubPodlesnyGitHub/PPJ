package PPJ20.Zadanie1;

public class Zwierze {
    private String name;
    private Osoba wlasciciel;

    public Zwierze(String name, Osoba wlasiciel) {
        this.name = name;
        this.wlasciciel = wlasiciel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWlasciciel(Osoba wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getName() {
        return name;
    }

    public Osoba getWlasciciel() {
        return wlasciciel;
    }

    @Override
    public String toString() {
        return "wlasiciel- " + wlasciciel + " Imie zwierzecia : " + name;
    }
}

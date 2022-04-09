package PPJ20.Zadanie1;

public class Papuga extends Zwierze{
    private String piora;
    private int wysokosc;
    public Papuga(String name, Osoba wlasiciel,int wysokosc,String piora) {
        super(name, wlasiciel);
        this.piora = piora;
        this.wysokosc = wysokosc;
    }

    public void setPiora(String piora) {
        this.piora = piora;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String getPiora() {
        return piora;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"Papuga " + "piora: " + piora + "wysokosc: " + wysokosc ;
    }
}

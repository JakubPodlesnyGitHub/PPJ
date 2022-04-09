package PPJ24_sladan.Zadanie4;

public class Wiadomosc {
    private int dzien;
    private int miesiac;
    private int rok;
    private String godzina;
    private String user;
    private String ip;
    private String tekst;

    public Wiadomosc(int dzien, int miesiac, int rok, String godzina, String user, String ip, String tekst){
        this.setDzien(dzien);
        this.setMiesiac(miesiac);
        this.setRok(rok);
        this.setGodzina(godzina);
        this.setUser(user);
        this.setIp(ip);
        this.setTekst(tekst);
    }

    @Override
    public String toString() {
        return getDzien() + "." + getMiesiac() + "." + getRok() + " " + godzina + " - " + user + " (" + getIp() + ") > " + getTekst();
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getGodzina() {
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

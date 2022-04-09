package PPJ19;

public class KulaNa {
    Kula kula;

    public KulaNa(Kwadrat kwadrat){
        kula = new Kula((kwadrat.getBok()*Math.sqrt(3))/2);
    }

    public KulaNa(Walec walec){
        kula = new Kula((Math.sqrt(Math.pow(walec.getPromien()*2,2)+Math.pow(walec.getWysokosc(),2)))/2);
    }

    public Kula getKula() {
        return kula;
    }
}

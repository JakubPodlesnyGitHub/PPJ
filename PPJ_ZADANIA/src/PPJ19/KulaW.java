package PPJ19;

public class KulaW {
    private Kula kula;

    public KulaW(Kwadrat kwadrat){
        kula = new Kula(kwadrat.getBok()/2);
    }

    public KulaW(Walec walec){
        if(walec.getWysokosc()>walec.getPromien())
            kula = new Kula(walec.getPromien());
        else
            kula = new Kula(walec.getWysokosc()/2);
    }

    public Kula getKula() {
        return kula;
    }

    public void show() {
    }
}

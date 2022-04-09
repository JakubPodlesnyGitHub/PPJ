package PPJ20.Zadanie1;

public class Pies extends Zwierze {
    private int wiek;
    private String rasa;

    public Pies(String name, Osoba wlasiciel,int wiek,String rasa) {
        super(name, wlasiciel);
        this.rasa = rasa;
        this.wiek= wiek;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public String toString() {
        return super.toString() + "Pies " +"rasa: "+rasa +"wiek: " + wiek ;
    }
}

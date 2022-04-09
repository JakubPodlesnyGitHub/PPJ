package PPJ21.Zadanie2;

public class Pojazd {
    private String marka;
    public Pojazd(String marka){
        this.marka = marka;
    }
    public String wyswietl(){
        return "Marka: " + marka;
    }
}

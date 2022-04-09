package PPJ21.Zadanie2;

public class Samochod extends Pojazd {
    private int vin;
    private int iloscDrzwi;

    public Samochod(String marka,int vin,int iloscDrzwi) {
        super(marka);
        this.vin = vin;
        this.iloscDrzwi = iloscDrzwi;
    }
    public String wyswietl(){
        return super.wyswietl() + " Vin: " + vin + " iloscDrzwi: " + iloscDrzwi;
    }
}

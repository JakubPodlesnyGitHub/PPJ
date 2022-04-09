package PPJ21.Zadanie1;

public class Ciastka {
    public String producent;
    public double masa;
    public String kod;
    public Ciastka(String producent,double masa,String kod){
        this.producent = producent;
        this.masa = masa;
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Producent: " + producent + " Masa: " + masa + " Kod: "+ kod;
    }
}

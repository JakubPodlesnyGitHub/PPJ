package PPJ19;

import org.w3c.dom.ls.LSOutput;

public class Owoc {
    public String nazwa;
    public double waga;
    public Owoc(String nazwa){
        this.nazwa  = nazwa;
        this.waga = Math.random()*(0.8-0.5)+0.5;
    }
    public void wypisz(){
        System.out.println("Nazwa owocu: "+nazwa);
        System.out.println("Waga owocu: " + waga);
    }

}

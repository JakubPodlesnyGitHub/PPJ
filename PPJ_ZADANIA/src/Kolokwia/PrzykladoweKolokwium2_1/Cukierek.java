package Kolokwia.PrzykladowyKolos2_1;

public class Cukierek {
    String smak;
    int nr_cukierka;
    public Cukierek(String smak,int nr_cukierka){
        this.smak=smak;
        this.nr_cukierka=nr_cukierka;
    }
    public String toString(){
        if(nr_cukierka<6){
            return"Cukierek nr: "+nr_cukierka+" smak: "+smak+"ll";
        }else{
            return"Cukierek nr: "+nr_cukierka+" smak: "+smak;
        }
    }
}

package PPJ21.Zadanie4;

public class Spawacz extends Osoba {
    private int rokPoczatku;
    private double srednieWynagrodzenie;
    public Spawacz(String imie, int rokUrodzenia,int rokPoczatku,double srednieWynagrodzenie) {
        super(imie, rokUrodzenia);
        this.rokPoczatku = rokPoczatku;
        this.srednieWynagrodzenie = srednieWynagrodzenie;
    }
    public void wyliczEmeryture(){
        int wiek_rozpoczecia_pracy = rokPoczatku - super.rokUrodzenia;
        int lata_pracy = 65-wiek_rozpoczecia_pracy;
        int do_smierci = 80-lata_pracy;
        /*System.out.println(wiek_rozpoczecia_pracy);
        System.out.println(lata_pracy);
        System.out.println(do_smierci);*/
        System.out.println((12*lata_pracy*srednieWynagrodzenie)*0.2/(15*12));

    }
}

package PPJ19;

public class Osoba {
    String imie;
    int rokUrodzenia;

    public Osoba(String imie,int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie) {
        this.imie = imie;
        this.rokUrodzenia = 1990;
    }

    public String zwrocImie() {
        return imie;
    }
    public int zwrocWiek(){
        return 2019-rokUrodzenia;
    }
    public static Osoba zwrocStarszaOsobe(Osoba o1,Osoba o2){
        if(o1.zwrocWiek()>o2.zwrocWiek()){
            return o1;
        }else {
            return o2;
        }
    }

    public static Osoba zwrocNajStarszaOsobe(Osoba[] tab) {
        Osoba najstarsza = tab[0];
        for(int i=0;i<tab.length;i++){
            if(tab[i].zwrocWiek()>najstarsza.zwrocWiek()){
                najstarsza = tab[i];
            }
        }
        return najstarsza;
    }
    @Override
    public String toString() {
        return zwrocImie() + " " + zwrocWiek();
    }
}

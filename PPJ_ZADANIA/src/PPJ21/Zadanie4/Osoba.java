package PPJ21.Zadanie4;

public class Osoba {
    private String imie;
    protected int rokUrodzenia;
    public Osoba(String imie,int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia = rokUrodzenia;
    }
    public void wyliczEmeryture(){
        System.out.println("Emerytura społeczna");
    }

}

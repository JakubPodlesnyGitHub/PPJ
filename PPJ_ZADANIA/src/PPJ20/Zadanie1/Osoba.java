package PPJ20.Zadanie1;

public class Osoba {public String name,nazwisko;
    public int rokUrodzenia;
    public Osoba(String name,String nazwisko,int rokUrodzenia){
        this.name= name;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRokUrodzenia(int rokUrodzenia){
        this.rokUrodzenia = rokUrodzenia;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public String getName() {
        return name;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String setNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Imie: " + name + "Nazwisko: " + nazwisko + "RokUrodzenia: " + rokUrodzenia ;
    }
}

package PPJ22.Zadanie3;


import PPJ22.Zadanie3.wyjatki.DrzewoBezOwocoweException;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;
    String nazwa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String nazwa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Nazwa Drzewa: " + nazwa + " przekrojDrzewa: " + przekrojDrzewa + " wysokosc: " + wysokosc + " Wiecznie Zielone: " + wiecznieZielone;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}

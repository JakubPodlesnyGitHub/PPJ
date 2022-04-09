package PPJ22.Zadanie3;

import PPJ22.Zadanie3.wyjatki.DrzewoBezOwocoweException;


public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String nazwa,String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa,nazwa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + " Kształt Liścia: " + ksztaltLiscia;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}

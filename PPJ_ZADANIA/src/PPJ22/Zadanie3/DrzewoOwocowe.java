package PPJ22.Zadanie3;


import PPJ22.Zadanie3.wyjatki.DrzewoBezOwocoweException;

public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String nazwa, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, nazwa, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + " Nazwa Owoca: " + nazwaOwoca;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}

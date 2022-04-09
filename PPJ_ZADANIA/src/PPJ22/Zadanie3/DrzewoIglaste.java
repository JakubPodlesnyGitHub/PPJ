package PPJ22.Zadanie3;


import PPJ22.Zadanie3.wyjatki.DrzewoBezOwocoweException;

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;
    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc,String nazwa, String przekrojDrzewa,int iloscIgiel,double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa,nazwa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + " Ilość igieł: " + iloscIgiel + " Długość szyszki: " + dlugoscSzyszki;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}

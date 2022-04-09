package Kolokwia.PrzykladowyKolos2_1;

public class Fabryka {
    String smak;
    int ilosc_cukierkow;

    public Fabryka(String smak) {
        this.smak = smak;
        ilosc_cukierkow = 0;
    }

    public Cukierek[] produkuj(int rozmiar) {
        System.out.println("Produkcja " + rozmiar + " cukierków o smaku "+ smak);
        Cukierek[] tab = new Cukierek[rozmiar];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Cukierek(smak, ilosc_cukierkow);
            if (i % 5 == 0) {
                System.out.println("Wyprodukowano 5 cukierków");
            }
        }
        return tab;
    }
}

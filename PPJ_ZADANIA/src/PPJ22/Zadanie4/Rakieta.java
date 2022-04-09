package PPJ22.Zadanie4;

import PPJ22.Zadanie4.wyjatki.ExplosionException;
import PPJ22.Zadanie4.wyjatki.LowFullException;


public class Rakieta {
    String nazwa;
    int wagaPaliwa;
    int szansa = (int) (Math.random() * 101);

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        wagaPaliwa += (int) (Math.random() * 1000);
    }

    public void start() throws LowFullException, ExplosionException {
        if (wagaPaliwa < 1000)
            throw new LowFullException("start anulowany - za mało paliwa");
        System.out.println("Udany start!!!");
        if (szansa < 90) {
            throw new ExplosionException();
        }
    }
}

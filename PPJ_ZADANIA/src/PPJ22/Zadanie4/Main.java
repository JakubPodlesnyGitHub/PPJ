package PPJ22.Zadanie4;


import PPJ22.Zadanie4.wyjatki.ExplosionException;
import PPJ22.Zadanie4.wyjatki.LowFullException;

public class Main {
    public static void main(String[] args) {
        Rakieta rakieta = new Rakieta("PJ", 500);
        rakieta.zatankuj();
        try {
            rakieta.start();
        } catch (LowFullException ex) {
            ex.printStackTrace();
        } catch (ExplosionException ex) {
            ex.printStackTrace();
        }

    }
}

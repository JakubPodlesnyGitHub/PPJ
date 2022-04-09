package PPJ16;

public class Cp1x {
    private final double lrzeczywista;
    private final double lurojona;

    public Cp1x(double x, double y) {
        this.lrzeczywista = x;
        this.lurojona = y;
    }

    public void show(Cp1x number) {
        System.out.println(number.lrzeczywista + " " + number.lurojona);
    }

    public Cp1x add(Cp1x liczba1, Cp1x liczba2) {
        Cp1x wynik = new Cp1x(liczba1.lrzeczywista + liczba2.lrzeczywista, liczba1.lurojona + liczba2.lurojona);
        return wynik;
    }

    public Cp1x inc(Cp1x liczba) {
        Cp1x wynik = new Cp1x(liczba.lrzeczywista + 1, liczba.lurojona);
        return wynik;
    }

    public Cp1x sub(Cp1x liczba1, Cp1x liczba2) {
        Cp1x wynik = new Cp1x(liczba1.lrzeczywista - liczba2.lrzeczywista, liczba1.lurojona - liczba2.lurojona);
        return wynik;
    }

    public Cp1x mul(Cp1x liczba1, Cp1x liczba2) {
        Cp1x wynik = new Cp1x(liczba1.lrzeczywista * liczba2.lrzeczywista, liczba1.lurojona * liczba2.lurojona);
        return wynik;
    }

}

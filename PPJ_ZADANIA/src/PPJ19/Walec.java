package PPJ19;

public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double r, double h) {
        this.promien = r;
        this.wysokosc = h;
    }

    public void show() {
        System.out.println("Pole walca: " + (2 * Math.PI * promien * promien + 2 * Math.PI * promien * wysokosc));
        System.out.println("Objętość walca: " + (Math.PI * promien * promien * wysokosc));
    }

    public double getPromien() {
        return promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }
}

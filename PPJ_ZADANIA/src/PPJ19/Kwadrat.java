package PPJ19;

public class Kwadrat {
    private double pole;
    private double bok;

    public Kwadrat(double a) {
        this.bok = a;
        this.pole = bok * bok;
    }

    public void show() {
        System.out.println("Pole k: " + pole);
        System.out.println("Objetosc k: " + pole * bok);
    }

    public double getBok() {
        return bok;
    }
}

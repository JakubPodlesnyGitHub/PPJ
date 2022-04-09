package PPJ20.Zadanie2;

import java.awt.*;

public class Prostokat extends Kwadrat{
    public double boka;
    public Prostokat(Color color, double bok, double boka, String name) {
        super(color, bok, name);
        this.boka = boka;
    }

    public double pole() {
        return bok * boka;
    }

    public double obwod() {
        return 2 * bok + 2 * boka;
    }

    @Override
    public String toString() {
        return name + " Pole: " + pole() + " Obwod: " + obwod() + super.toString();
    }
}

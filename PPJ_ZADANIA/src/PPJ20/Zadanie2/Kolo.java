package PPJ20.Zadanie2;

import java.awt.*;

public class Kolo extends Figura {
    private double promien;

    public Kolo(Color color, double promien, String name) {
        super(color, name);
        this.promien = promien;

    }

    public double pole() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double obwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public String toString() {
        return name + " Pole: " + pole() + " Obwod: " + obwod() + super.toString();
    }
}

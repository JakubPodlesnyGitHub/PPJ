package PPJ20.Zadanie2;

import java.awt.*;

public class Trojkat extends Figura {
    private double bokc;
    private double bokb;
    private double boka;

    public String name;

    public Trojkat(Color color, double bokb, double boka, double bokc, String name) {
        super(color, name);
        this.bokc = bokc;
        this.bokb = bokb;
        this.boka = boka;
        this.name = name;
    }

    public double pole() {
        double p = /*(bokb + boka + bokc)*/obwod()/ 2;
        return Math.sqrt(p * (p - boka) * (p - bokb) * (p - bokc));
    }

    public double obwod() {
        return bokc + bokb + boka;
    }

    @Override
    public String toString() {
        return name + " Pole: " + pole() + " Obwod: " + obwod() + super.toString();
    }
}

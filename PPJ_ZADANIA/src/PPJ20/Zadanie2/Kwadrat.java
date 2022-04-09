package PPJ20.Zadanie2;

import java.awt.*;

public class Kwadrat extends  Figura {
    public double bok;

    public Kwadrat(Color color, double bok, String name) {
        super(color, name);
        this.bok = bok;
    }

    public double pole() {
        return bok * bok;
    }

    public double obwod() {
        return 4 * bok;
    }

    @Override
    public String toString() {
        return  name + " pole: "+ pole()+ " Obwod: "+ obwod()+super.toString();
    }
}

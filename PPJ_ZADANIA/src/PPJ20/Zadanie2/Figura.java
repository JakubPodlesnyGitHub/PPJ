package PPJ20.Zadanie2;

import java.awt.*;

public class Figura {
    public Color color;
    public String name;
    public Figura(Color color,String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Color: " + color;
    }
}


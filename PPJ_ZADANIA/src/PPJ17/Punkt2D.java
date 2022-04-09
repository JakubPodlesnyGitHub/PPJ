package PPJ17;

public class Punkt2D {
    String name;
    double x;
    double y;

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void changeName(String name) {
        this.name = name;
    }
    public void chengeX(double x) {
        this.x = x;
    }
    public void changeY(double y) {
        this.y = y;
    }

    public void show() {
        System.out.println("Nazawa punktu: "+ getName());
        System.out.println("X: "+ getX());
        System.out.println("Y: "+ getY());
    }

}

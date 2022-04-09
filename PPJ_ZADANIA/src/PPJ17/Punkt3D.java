package PPJ17;

public class Punkt3D {
    String name;
    double x;
    double y;
    double z;

    public Punkt3D(String name,double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
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

    public void changeZ(double y) {
        this.z = z;
    }
    public void show() {
        System.out.println("X: "+ getX());
        System.out.println("Y: "+ getY());
        System.out.println("Z: " + getZ());
    }
}

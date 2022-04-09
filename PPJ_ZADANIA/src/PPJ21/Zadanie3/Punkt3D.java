package PPJ21.Zadanie3;

public class Punkt3D extends Punkt2D {
    public double z;
    public Punkt3D(double x, double y,double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double odleglosc(Punkt3D p1){
        return Math.sqrt(Math.pow((p1.getX()-x),2) + Math.pow((p1.getY()-y),2)+Math.pow((p1.getZ()-z),2));
    }
}

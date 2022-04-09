package PPJ17;

public class Trojkat {
    Punkt2D p1, p2, p3;


    public Trojkat(Punkt2D p1, Punkt2D p2, Punkt2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //2d
    public double getSide(Punkt2D p1, Punkt2D p2) {
        return Math.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()), 2) + Math.pow(Math.abs(p1.getY() - p2.getY()), 2));
    }

    public double getSurface() {
        return getSide(p1, p2) + getSide(p1, p3) + getSide(p2, p3);
    }


    public double getParamiter() {
        return 0.5 * Math.abs((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - (p2.getY() - p1.getY()) * (p3.getX() - p1.getX()));
    }

}

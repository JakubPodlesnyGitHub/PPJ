package PPJ21.Zadanie3;

public class Punkt2D {
    public double x;
    public double y;
    public Punkt2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double odleglosc(Punkt2D p1){
        return Math.sqrt(Math.pow((p1.getX()-x),2) + Math.pow((p1.getY()-y),2));
    }

}

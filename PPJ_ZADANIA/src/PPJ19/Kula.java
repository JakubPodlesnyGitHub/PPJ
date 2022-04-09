package PPJ19;

public class Kula {
    private double r;

    public Kula(double r){
        this.r = r;
    }

    public void show(){
        System.out.println("Kula o promieniu " + getR());
    }

    public double getR() {
        return r;
    }
}

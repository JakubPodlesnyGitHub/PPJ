package PPJ17;

public class Trojkatv2 {
    Punkt3D p13D, p23D, p33D;

    public Trojkatv2(Punkt3D p13D, Punkt3D p23D, Punkt3D p33D) {
        this.p13D = p13D;
        this.p23D = p23D;
        this.p33D = p33D;
    }

    private Punkt3D wektor(Punkt3D a, Punkt3D b) {
        return new Punkt3D("wektor" + a.getName() + b.getName(), b.getX() - a.getX(), b.getY() - a.getY(), b.getZ() - a.getZ());
    }

    public double getParamiter() {
        Punkt3D w1 = wektor(p13D, p23D);
        Punkt3D w2 = wektor(p13D, p33D);
        return 0.5 * Math.abs(Math.sqrt(Math.pow((w1.getY() * w2.getZ() - w1.getZ() * w2.getY()), 2) + Math.pow(-(w1.getX() * w2.getZ() - w1.getZ() * w2.getX()), 2) + Math.pow((w1.getX() * w2.getY() - w1.getY() * w2.getX()), 2)));
    }
    public void show(){
        System.out.println("Wierzchołki:");
        p13D.show();
        p23D.show();
        p33D.show();
        System.out.println("Pole: "+ getParamiter());
    }
}

package PPJ17;

public class Main {
    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        Punkt2D p2 = new Punkt2D();
        Punkt2D p3 = new Punkt2D();
        Punkt3D p1d = new Punkt3D("A",2,-1,2);
        Punkt3D p2d = new Punkt3D("B",1,2,-1);
        Punkt3D p3d = new Punkt3D("C",3,2,1);
        //System.out.println(p1.getX());
        p1.changeY(5.0);
        p1.chengeX(6);
        p1.changeName("1 punkt");
        p1.show();
        p2.changeY(4.0);
        p2.chengeX(6.0);
        p2.changeName("2 punkt");
        p2.show();
        p3.changeY(2.0);
        p3.chengeX(10.0);
        p3.changeName("3 punkt");
        p3.show();
        Trojkat t1 = new Trojkat(p1, p2, p3);
        System.out.println("\n"+t1.getSurface());
        System.out.println("\n"+t1.getParamiter());
        Trojkatv2 t13d = new Trojkatv2(p1d,p2d,p3d);
        t13d.show();

    }
}

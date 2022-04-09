package PPJ21.Zadanie3;

public class Main {
    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D(5, 10);
        Punkt2D p2 = new Punkt2D(6, 20);
        Punkt3D p3 = new Punkt3D(1, 2, 4);
        Punkt3D p4 = new Punkt3D(1, 3, 5);
        System.out.println(p2.odleglosc(p1));
        System.out.println(p4.odleglosc(p3));
    }
}

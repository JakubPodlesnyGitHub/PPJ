package PPJ3;

public class Zadanie2 {
    public static void main(String[] args) {
        double wylosowana1 = Math.random();
        System.out.println(wylosowana1 > 0.2 ? "Jest większa" : "Jest mniejsza");
        double wylosowana2 = Math.random();
        System.out.println(wylosowana1 > 0.2 && wylosowana2 > 0.2 ? "Jest większa" : "Jest mniejsza");
        double wylosowana3 = Math.random();
        System.out.println(wylosowana1 > 0.2 && wylosowana2 > 0.2 && wylosowana3 > 0.2? "Jest większa" : "Jest mniejsza");
        double wylosowana4 = Math.random();
        System.out.println(wylosowana2 > 0.2 && wylosowana3 > 0.2 && wylosowana4 > 0.2 ? "Jest większa" : "Jest mniejsza");
        double wylosowana5 = Math.random();
        System.out.println(wylosowana3 > 0.2 && wylosowana4 > 0.2 && wylosowana5 > 0.2 ? "Jest większa" : "Jest mniejsza");
    }
}

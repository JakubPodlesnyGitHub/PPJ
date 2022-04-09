package PPJ20.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Michał ", "Polak ", 1999);
        Zwierze z1 = new Zwierze("Mruczek", o1);
        System.out.println(z1);
        Pies p1 = new Pies("Azor ", o1, 13, "rotwiler");
        Kot k1 = new Kot("Puszek ", o1, 13, 20);
        Krolik kr1 = new Krolik("Królik ", o1, 400, " black");
        Papuga pp1 = new Papuga("Stefan ", o1, 100, "Ładne");
        System.out.println(p1);
        System.out.println(k1);
        System.out.println(pp1);
        System.out.println(kr1);
    }
}

package PPJ21.Zadanie4;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Janusz", 1950);
        Osoba o2 = new Osoba("Janusz", 1960);
        Spawacz s1 = new Spawacz("Marian", 1987, 2000, 200);
        s1.wyliczEmeryture();
    }
}
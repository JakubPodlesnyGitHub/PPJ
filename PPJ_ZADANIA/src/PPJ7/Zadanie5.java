package PPJ7;

public class Zadanie5 {
    public static void main(String[] args) {
        double wynik = 0;
        for (int i = 0; i < 10; i++) {
            wynik += 1.0 / (1 << i);
            System.out.println(wynik);
        }
    }
}

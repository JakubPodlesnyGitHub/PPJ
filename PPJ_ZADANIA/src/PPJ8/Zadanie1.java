package PPJ8;

public class Zadanie1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 8 == 0)
                System.out.println(i + "\n" + -i);

        }
    }
}

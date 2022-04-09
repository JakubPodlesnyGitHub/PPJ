package PPJ8;

public class Zadanie6 {
    public static void main(String[] args) {
        for (int i = -3; i <= 3; i++) {
            for (int j = 0; j < Math.abs(i) % 10; j++) {
                System.out.print("  ");
            }
            for (int j = -3 + Math.abs(i); j < 4 - (Math.abs(i) % 10); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

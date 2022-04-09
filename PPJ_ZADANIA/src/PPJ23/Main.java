package PPJ23;


import PPJ23.Wyjatki.GrinchException;
import PPJ23.Wyjatki.SpadajaceSanieException;

public class Main {

    public static void main(String[] args) {
        Sanie s1 = new Sanie(1, 0, 0,30, null);
        try {
            for (int i = 0; i < 1000; i++) {
                s1.lec();
            }
        } catch (SpadajaceSanieException ex) {
            ex.printStackTrace();
        } catch (GrinchException ex) {
            ex.printStackTrace();
        }
    }
}
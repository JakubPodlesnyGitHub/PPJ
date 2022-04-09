package PPJ22.Zadanie1;

public class DetektorDymu {
    boolean x = true;

    public static void main(String[] args) {
        DetektorDymu d = new DetektorDymu();
        try {
            d.sprawdz();
        }
        catch (Alarm a){
            a.getMessage("ok");
        }
    }

    public void sprawdz() throws Alarm {
        if (x == true) {
            throw new Alarm();
        }
    }
}

package PPJ22.Zadanie4.wyjatki;

public class LowFullException extends Exception {
    public LowFullException(String msg) {
        super(msg);
        //System.out.println("start anulowany - za mało paliwa");
    }
}

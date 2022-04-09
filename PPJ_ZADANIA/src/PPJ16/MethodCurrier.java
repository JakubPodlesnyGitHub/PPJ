package PPJ16;

public class MethodCurrier {

    public void setValue(int liczba) {
        System.out.println("Stan zmienej przed: "+liczba);
        liczba *=5;
        System.out.println("Stan zmienej po: "+liczba);
    }

    public void setValue(float liczba) {
        System.out.println("Stan zmienej przed: "+liczba);
        liczba *=5;
        System.out.println("Stan zmienej po: "+liczba);
    }
    public void setValue(Number numb){
        numb.showValue();
        numb.setValue(numb.a*5);
        numb.showValue();
    }
}

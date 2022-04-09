package PPJ18;

public class Kwadrat {
    private double bok;
    public Kwadrat(double kwadrat){
        this.bok = kwadrat;
    }
    public void show(){
        System.out.println("Pole: " + bok*bok);
        System.out.println("Objętość: " + bok*bok*bok);

    }
}

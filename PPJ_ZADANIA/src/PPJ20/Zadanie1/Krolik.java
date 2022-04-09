package PPJ20.Zadanie1;

public class Krolik extends Zwierze {
    private int wielkoscLapy;
    private String color;

    public Krolik(String name, Osoba wlasiciel,int wielkoscLapy,String color) {
        super(name, wlasiciel);
        this.wielkoscLapy = wielkoscLapy;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWielkoscLapy(int wielkoscLapy) {
        this.wielkoscLapy = wielkoscLapy;
    }

    public String getColor() {
        return color;
    }

    public int getWielkoscLapy() {
        return wielkoscLapy;
    }

    @Override
    public String toString() {
        return super.toString() + "Królik" + "WielkoscLapy: "+wielkoscLapy + " color: "+ color  ;
    }
}

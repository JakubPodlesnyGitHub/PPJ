package PPJ19;

public class Dzem {
    private String smak;
    private double waga;

    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(double waga) {
        this.smak = "No name";
        this.waga = waga;
    }

    public Dzem(String smak) {
        this.waga = 100.0;
        this.smak = smak;
    }
    @Override
    public String toString() {
        return "Dżem o smaku " + smak + ", waga: " + waga;
    }
}

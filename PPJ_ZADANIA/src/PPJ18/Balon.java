package PPJ18;

public class Balon {
    public double hel_objetosc;
    private final double przelicznik = 6.0/1000/0.007;
    public Balon(){
        hel_objetosc = Math.random()*(0.009-0.005+1)+0.005;
    }
    public double podajUdzwig(){
        return hel_objetosc*przelicznik;
    }
}

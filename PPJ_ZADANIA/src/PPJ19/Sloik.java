package PPJ19;

public class Sloik {
    Dzem dzem;
    boolean isOpen;

    public Sloik(Dzem dzem){
        this.dzem = dzem;
        isOpen = false;
    }
    public void otworz(){
        isOpen = true;
    }
    public void zamknij(){
        isOpen = false;
    }
    public boolean CzyOtwarty(){
        System.out.println(isOpen?"Otwarty":"Nie otwarty");
        return isOpen;
    }
    @Override
    public String toString() {
        return "Słoik z " + dzem + ". Stan: " + (isOpen?"Otwarty":"Zamknięty");
    }

}

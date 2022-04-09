package PPJ18;

public class Wyraz {
    public char[] tab1;
    public int dlugosc;

    public Wyraz() {
        tab1 = new char[100];
        dlugosc = 0;
    }

    public void dodajZnak(char znak) {
        if (dlugosc >= tab1.length) {
            char[] tab2 = new char[dlugosc + 101];
            for (int i = 0; i < tab1.length; i++) {
                tab2[i] = tab1[i];
            }
            tab1=tab2;
        }

        tab1[dlugosc++] = znak;
    }
    public int length(){
        return dlugosc;
    }
    public void wyswietl(){
        for(int i =0;i<dlugosc;i++){
            System.out.print(tab1[i]+" , ");
        }
    }
}

package PPJ16;

public class Main {
    public static void main(String[] args) {
        System.out.println("------1-----------");
        MethodCurrier o1 = new MethodCurrier();
        o1.setValue(20000);
        o1.setValue(5f);
        o1.setValue('a');
        o1.setValue(3);
        System.out.println("------------2---------------");
        Number number = new Number();
        number.setValue(5);
        o1.setValue(number);
        number.showValue();
        System.out.println("----------3----------------");
        Osoba os1 = new Osoba();
        os1.imie = "Jakub";
        os1.nazwisko = "Kowalski";
        os1.rokUrodzenia = 2000;
        System.out.println("--------------4----------------");
        os1.show();
        System.out.println("-----------------5---------------------");
        Cp1x wynik = new Cp1x(0,0);
        Cp1x liczb1= new Cp1x(1,1);
        Cp1x liczb2= new Cp1x(5,5);
        Cp1x liczb3= new Cp1x(10,10);
        System.out.print("Liczba2: ");
        liczb2.show(liczb2);

        wynik = wynik.add(liczb2,liczb3);
        wynik.show(wynik);
        System.out.println("/////////////");
        wynik = wynik.sub(liczb2,liczb3);
        wynik.show(wynik);
        System.out.println("///////////");
        wynik = wynik.mul(liczb2,liczb3);
        wynik.show(wynik);
        System.out.println("//////////////");
        wynik = wynik.inc(liczb1);
        wynik.show(wynik);
    }
}

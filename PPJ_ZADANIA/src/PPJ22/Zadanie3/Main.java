package PPJ22.Zadanie3;


import PPJ22.Zadanie3.wyjatki.DrzewoBezOwocoweException;

public class Main {
    public static void main(String[] args) {
        Drzewo [] drzewa = new Drzewo[6];
        DrzewoIglaste d1 = new DrzewoIglaste(true,10,"Sosna","gęsty",100000,6);
        DrzewoIglaste d2 = new DrzewoIglaste(true,3,"Modrzew","bardziejgesty",5000,2);
        DrzewoLisciaste d3 = new DrzewoLisciaste(false,5,"Dąb","rozgal",10);
        DrzewoLisciaste d4 = new DrzewoLisciaste(false,1,"Osik","proste",4);
        DrzewoOwocowe d5 = new DrzewoOwocowe(false,2,"Morelowiec","pionowy",10,"Morela");
        DrzewoOwocowe d6 = new DrzewoOwocowe(false,1,"Sliwa","naBoki",10,"Sliwa");
        drzewa[0]= d1;
        drzewa[1]= d2;
        drzewa[2]= d3;
        drzewa[3]= d4;
        drzewa[4]= d5;
        drzewa[5]= d6;
        /*for(int i=0;i<drzewa.length;i++){
            System.out.println(drzewa[i]);
        }*/
        for(int i=0;i<drzewa.length;i++){
            try {
                drzewa[i].zerwijOwoc();
            }
            catch (DrzewoBezOwocoweException ex){
                ex.printStackTrace();
            }
        }
    }
}

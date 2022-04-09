package PPJ3;

public class Zadanie5 {
    public static void main(String[] args) {
        byte x = -22;
        short y = -10;
        int z = -20;
        int wrt = 10;
        if(wrt>-10 && wrt<=-10 && wrt>-5 && wrt<0 && wrt>5 && wrt <10){
            System.out.println("Zakres A");
        }else if(wrt>0 && wrt>-8 && wrt<=-3){
            System.out.println("Zakres B");
        }else if(wrt>z)
            System.out.println("Zakres C");
    }
}

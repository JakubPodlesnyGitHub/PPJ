package PPJ10;

public class Zadanie1 {
    public static void main(String[] args) {
        int [] tab= new int[10];
        for(int i=0;i<tab.length;i++){
            tab[i]= (int)(Math.random()*100);
            System.out.println(tab[i]);
        }
        System.out.println("/////////////////////////////////////////////////");
        for(int i =0;i<tab.length;i++){
            if(i%2==0){
                System.out.println(tab[i]);
            }
        }
        System.out.println("////////////////////////////////////////////////////");
        for(int i =0;i<tab.length;i++){
            if(i%2!=0){
                System.out.println(tab[i]);
            }
        }
    }
}

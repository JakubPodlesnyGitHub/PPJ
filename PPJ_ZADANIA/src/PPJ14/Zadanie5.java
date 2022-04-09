package PPJ14;

public class Zadanie5 {
    public static void main(String[] args) {
        Od_Do(2,19);
    }
    public static void Od_Do(int from,int to){
        if(from<to){
            System.out.println(from+ ",");
            from++;
            Od_Do(from,to);
        }
        if(from>to){
            System.out.println(to+ ",");
            to--;
            Od_Do(from,to);
        }
    }
}

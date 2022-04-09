package PPJ13;

public class Zadanie10 {
    public static void main(String[] args) {

    }
    public static void printMonth(int m,int y){
        int [] miesiace = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0 && y%100!=0 || y%400==0){
            miesiace[2]+=1;
        }
    }
}

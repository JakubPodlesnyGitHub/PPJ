package PPJ8;

public class Zadanie3 {
    public static void main(String[] args) {
        int wrt = 43707;
        int even = 0;
        int odd = 0;
        boolean isEven = true;

        for (int i = 1; i < wrt; i = i << 1) {
            if (isEven)
                even += wrt & i;
            else
                odd += wrt & i;
            isEven = !isEven;
        }
        System.out.println(even);
        System.out.println(odd);
        //moje rozwiazanie 3 ppj8
        /*int wrt = 43707;
        int even = 0;
        int odd = 0;
        int mA=1;
        int mW = 1;
        for(int i = 0 ;i<16;i++){
            if((wrt&mA) > 0){
                odd = odd | mW;
            }
            mA = mA<<1;
            if((wrt&mA) > 0){
                even = even | mW;
            }
            mA=mA << 1;
            mW = mW << 1;
        }
        System.out.println(even);
        System.out.println(odd);}*/

    }
}

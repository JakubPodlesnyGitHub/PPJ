package PPJ24_sladan.Zadanie1;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileReader fileReader = new FileReader("1.txt");
            int tmp;
            while((tmp = fileReader.read())!=-1)
                stringBuilder.append((char)tmp);

            System.out.println(stringBuilder.toString());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

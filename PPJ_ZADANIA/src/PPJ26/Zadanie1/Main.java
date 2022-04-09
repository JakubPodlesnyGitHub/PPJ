package Zadanie1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("serverLog.txt");
            int tmp;
            while((tmp = fileReader.read())!= -1){
                stringBuilder.append((char)tmp);
                //System.out.println(stringBuilder);
            }
            Pattern pattern = Pattern.compile(">\\s+([A-Z]+)");
            Matcher matcher = pattern.matcher(stringBuilder);
            while(matcher.find()){
                System.out.println(matcher.group(1));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

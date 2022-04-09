package Zadanie2;

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
            Pattern pattern = Pattern.compile("\\d{1,2}:\\d{2}:\\d{2}:\\s(A|P)M");
            Matcher matcher = pattern.matcher(stringBuilder);
            String s = " ";
            int counter = 0;
            while(matcher.find()){
                String text = matcher.group(2);
                if(s.equals(" ")){
                    s = text;
                    counter++;
                }else{
                    if(s.equals(text)){
                        counter++;
                    }else{
                        System.out.println(s + " Zapisano: "+ counter + " logów " );
                        s=text;
                        counter=1;
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

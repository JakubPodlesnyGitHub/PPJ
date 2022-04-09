package PPJ26.Zadanie2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InnaOpcja {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try {
            FileReader fr = new FileReader("serverLog.txt");
            int wrt;
            while((wrt=fr.read())!=-1){
                sb.append((char)wrt);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Pattern pattern = Pattern.compile("(\\d{1,2}:\\d{1,2}:\\d{1,2}) (A|P)M");
        Matcher matcher = pattern.matcher(sb);
        int x =1;
        if(matcher.find()) {
            String str = matcher.group(1);
            while (matcher.find()) {
                if (matcher.group(1).equals(str)) {
                    x++;
                } else {
                    System.out.println(str + " - " + x);
                    str = matcher.group(1);
                    x = 1;
                }

            }
        }
    }
}

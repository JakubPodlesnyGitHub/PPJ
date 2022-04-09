package PPJ26.Zadanie5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("serverLog.txt");
            int tmp;
            while ((tmp = fileReader.read()) != -1) {
                stringBuilder.append((char) tmp);
                //System.out.println(stringBuilder);
            }
            Pattern pattern = Pattern.compile("([^\\n\\d](\\d{3})\\D)");
            Matcher matcher = pattern.matcher(stringBuilder);
            StringBuilder sb1 = new StringBuilder();
            boolean flag = true;

            while (matcher.find()) {
                System.out.println(matcher.group(2));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


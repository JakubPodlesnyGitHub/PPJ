package PPJ24_sladan.Zadanie2;

import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileReader fileReader = new FileReader("1.txt");

            int tmp;
            while ((tmp = fileReader.read()) != -1)
                stringBuilder.append((char) tmp);


            System.out.println(stringBuilder.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Pattern pattern = Pattern.compile("\\p{IsAlphabetic}+");
        Matcher matcher = pattern.matcher(stringBuilder);
        int counter = 0;
        while (matcher.find())
            counter++;

        System.out.println(counter);
    }
}

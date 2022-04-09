package PPJ24_sladan.Zadanie3;

import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       /* StringBuilder stringBuilder = new StringBuilder();

        try {
            FileReader fileReader = new FileReader("1.txt");

            int tmp;
            while ((tmp = fileReader.read()) != -1)
                stringBuilder.append((char) tmp);

            System.out.println(stringBuilder.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/

        String text = "wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim";

        Pattern pattern = Pattern.compile("[0-9]+-[0-9]+");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find())
            counter++;
        System.out.println(counter);
    }
}
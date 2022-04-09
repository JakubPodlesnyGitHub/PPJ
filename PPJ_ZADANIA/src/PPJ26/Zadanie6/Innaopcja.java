package PPJ26.Zadanie6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Innaopcja {
    public static void main(String[] args) {
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
                //System.out.println(matcher.group(2));
                String tmp1 = matcher.group(2);
                for (int i = 0; i < sb1.length(); i += 3) {
                    if ((sb1.charAt(i) == tmp1.charAt(0)) && (sb1.charAt(i + 1) == tmp1.charAt(1)) && (sb1.charAt(i + 2) == tmp1.charAt(2))) {
                        flag = false;
                        break;
                    }

                }
                if (flag == true) {
                    sb1.append(tmp1);
                }
                flag = true;
            }
            for (int i = 0; i < sb1.length(); i += 3) {
                //System.out.println(sb1.substring(i,i+3));
            }
            String[] tablica = new String[sb1.length() / 3];
            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = sb1.substring(3 * i, 3 * i + 3);
                System.out.println(tablica[i]);
            }
            sort(tablica);
            System.out.println("Po sortowaniu: ");
            for (int i = 0; i < tablica.length; i++) {
                System.out.println(tablica[i]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void sort(String[] tablica) {
        String tmp;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i].compareTo(tablica[j]) < 0) {
                    tmp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = tmp;
                }
            }
        }
    }
}


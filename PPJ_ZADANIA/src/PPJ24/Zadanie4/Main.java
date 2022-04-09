package PPJ24_sladan.Zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Wiadomosc[] tab = new Wiadomosc[418];
        try {
            Scanner scanner = new Scanner(new File("serverLog.txt"));

            Pattern data = Pattern.compile("((0?\\d|1[0-2])/(((0?[1-9])|([1-2]\\d))|(3[0-1]))/(19|20\\d{2}))");
            Pattern godzina = Pattern.compile("(\\d+:\\d+:\\d+ (A|P)M)");
            Pattern user = Pattern.compile(" - (.*) \\(");
            Pattern ip = Pattern.compile("(([01]?\\d\\d?|2[1-4]\\d|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5]))");
            Pattern wiadomosc = Pattern.compile("> (.*)");

            int i=0;
            while (scanner.hasNextLine()){
                String tmp = scanner.nextLine();
                Matcher m_data = data.matcher(tmp);
                Matcher m_godzina = godzina.matcher(tmp);
                Matcher m_user = user.matcher(tmp);
                Matcher m_ip = ip.matcher(tmp);
                Matcher m_wiadomosc = wiadomosc.matcher(tmp);
                if(m_data.find() && m_godzina.find() && m_user.find() && m_ip.find() && m_wiadomosc.find())
                    tab[i++] = new Wiadomosc(Integer.parseInt(m_data.group(3)),
                            Integer.parseInt(m_data.group(2)),
                            Integer.parseInt(m_data.group(8)),
                            m_godzina.group(),
                            m_user.group(1),
                            m_ip.group(),
                            m_wiadomosc.group(1));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

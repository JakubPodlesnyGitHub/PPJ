package PPJ24_sladan.Zadanie5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Wiadomosc1[] tab = new Wiadomosc1[418];
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("serverLog.txt"));
            int i = 0;
            while (scanner.hasNextLine()) {
                String tmp = scanner.nextLine();
                //tab[i++] = new Wiadomosc1();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        showByDay(tab, 23, 8, 2006);
        showByDay(tab, 1, 8, 2006);
        showByMonth(tab, 8, 2006);
        showByMonth(tab, 8, 2007);
        showByIP(tab, "127.0.0.1");
        showByIP(tab, "10.0.2.143");

    }

    public static void showByDay(Wiadomosc1[] tab, int day, int month, int year) {
        System.out.println("Filtered by " + day + "/" + month + "/" + year);
        for (int i = 0; i < tab.length; i++)
            if (tab[i].getDzien() == day && tab[i].getMiesiac() == month && tab[i].getRok() == year)
                System.out.println(tab[i]);
    }

    public static void showByMonth(Wiadomosc1[] tab, int month, int year) {
        System.out.println("Filtered by " + month + "/" + year);
        for (int i = 0; i < tab.length; i++)
            if (tab[i].getMiesiac() == month && tab[i].getRok() == year)
                System.out.println(tab[i]);
    }

    public static void showByIP(Wiadomosc1[] tab, String ip) {
        System.out.println("Filtered by " + ip);
        for (int i = 0; i < tab.length; i++)
            if (tab[i].getIp().equals(ip))
                System.out.println(tab[i]);
    }
}

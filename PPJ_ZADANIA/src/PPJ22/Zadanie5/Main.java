package PPJ22.Zadanie5;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "Plik.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Ala ma kota");
        } catch (IOException ex) {
            System.out.println("Błąd Nie ma takiego pliku lub nic nie ma w tym pliku");
        } finally {
            fileWriter.close();
        }
        Scanner in2 = null;


        try {
            in2 = new Scanner(new FileInputStream(fileName));
            int[] tablica_male = new int['Z' - 'A' + 1];
            int[] tablica_duze = new int['z' - 'a' + 1];
            for (int i = 0; i < tablica_duze.length; i++) {
                tablica_duze[i] = 0;
                tablica_male[i] = 0;
            }
            String str;
            char zmienna_pomocnicza_znak;
            while (in2.hasNext()){
                str = in2.next();
                for (int i = 0; i < str.length(); i++) {
                    zmienna_pomocnicza_znak = str.charAt(i);
                    if (zmienna_pomocnicza_znak >= 'A' && zmienna_pomocnicza_znak <= 'Z') {
                        tablica_duze[zmienna_pomocnicza_znak - 'A']++;
                    } else if (zmienna_pomocnicza_znak >= 'a' && zmienna_pomocnicza_znak <= 'z') {
                        tablica_male[zmienna_pomocnicza_znak - 'a']++;
                    }
                }
            }
            for (int i = 0; i < tablica_duze.length; i++) {
                if( tablica_duze[i] != 0)
                    System.out.println((char) (i + 'A') + " : " + tablica_duze[i]);
            }
            for (int i = 0; i < tablica_male.length; i++) {
                if(tablica_male[i] != 0)
                    System.out.println((char) (i + 'a') + " : " + tablica_male[i]);
            }
        } catch (IOException ex) {
            System.out.println("Problem z dostepem do plku");
        } finally {
            in2.close();
        }
    }
}

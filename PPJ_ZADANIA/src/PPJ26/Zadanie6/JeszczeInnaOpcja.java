package PPJ26.Zadanie6;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JeszczeInnaOpcja {
    public static void main(String[] args) {
        /*StringBuilder stringBuilder = new StringBuilder();
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
            for (int i = 0; i < tab.length; i++) {
                for(int j = i + 1; j < tab.length; j++) {
                    if (tab[i] != null  && tab[i].equals(tab[j])) {
                        tab[j] = null;
                    }
                }

                if(tab[i] != null){

                    counter++;
                }
            }
            int arr[]=new int[counter];
            counter=0;
            for(int i=0;i<tab.length;i++){
                if(tab[i]!=null) arr[counter++]=Integer.parseInt(tab[i]);

            }
            System.out.println("-----------W kolejnosci-----------");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

            for(int i=0;i<arr.length;i++){
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        int war=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=war;

                    }
                }
            }
            System.out.println("----------Posortowane-----------");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    }
}

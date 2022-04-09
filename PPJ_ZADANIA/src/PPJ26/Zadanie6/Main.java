package PPJ26.Zadanie6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
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

        int[] arr = new int[0];

        Pattern pattern = Pattern.compile("([^\\n\\d](\\d{3})\\D)");
        String str;
        Matcher matcher = pattern.matcher(sb);
        while(matcher.find()){
            str = matcher.group(2);
            if(!find(str,arr)){
                arr=add(str,arr);

            }


        }
        show(arr);
        sort(arr);
        System.out.println("Po sortowaniu");
        show(arr);
    }

    public static boolean find(String str, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==Integer.parseInt(str)){
                return true;
            }
        }
        return false;
    }

    public static int[] add(String str, int[] arr){
        int[] tmp = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            tmp[i]=arr[i];
        }
        tmp[tmp.length-1] = Integer.parseInt(str);
        return tmp;
    }

    public static void show(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void sort(int[] arr){
        boolean done = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    arr[j-1]+=arr[j];
                    arr[j]= arr[j-1]-arr[j];
                    arr[j-1]-=arr[j];
                    done=false;
                }
            }
            if(done){
                return;
            }
        }
    }
}

package PPJ7;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        //Zadanie1
        Scanner in = new Scanner(System.in);
        byte wrt = in.nextByte();
        byte maska = (byte) (0b10000000);
        boolean flag = false;


        byte wynik = (byte) (wrt & maska);
        if (wynik != 0) {
            flag = true;
        }
        if (flag)
            System.out.println(wynik);
        maska = (byte) ((byte) (maska >> 1) & 0x7f);
        System.out.println(maska);
/*
        for (int i = 0; i < 7; i++) {
            wynik = (byte) (wrt & maska);
            if (wynik != 0) {
                flag = true;
            }
            if (flag)
                System.out.println(wynik);
            maska = (byte) (maska >> 1);
        }*/
    }
}
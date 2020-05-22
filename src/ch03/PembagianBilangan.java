package ch03;

import java.util.Scanner;

public class PembagianBilangan {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int a = 0;
        int b = 30;
        System.out.println("YUK MENENTUKAN BILANGAN PEMBAGIAN YANG TERKECIL");
        System.out.println("INPUTKAN ANGKA : ");
        a=input.nextInt();
        input.close();

        System.out.println("_________________________________________");


        while ( b>=a ) {
            if ( (a%b)!=0 ) {

            } else {
                System.out.println("Pembagi Yang Bilangan Terkecil = " + b);
                b=b+1;
            }
        }


    }
    
}
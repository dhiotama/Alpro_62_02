package ch02;

import java.util.Date;

public class ObjectObat {
    public static void main(String[] args) {
        Obat x1 = new Obat();
        x1.barcode = "9272635634";
        x1.nama = "liquid Oatdrip";
        x1.tanggalkadaluarsa = new Date (2020-10-10);
        x1.harga = 6000;

        Obat x2 = new Obat();
        x2.barcode = "9272635634";
        x2.nama = "liquid Exo";
        x2.tanggalkadaluarsa = new Date (2020-4-13);
        x2.harga = 8000;

        System.out.println(x1.nama + " (" + x1.barcode +")");

        System.out.println("Harga: Rp" + x1.harga);
        System.out.println("Exp: " + x1.tanggalkadaluarsa.toString());

        System.out.println("===================================");

        System.out.println(x2.nama + " (" + x2.barcode +")");

        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " + x2.tanggalkadaluarsa.toString());


    }


}
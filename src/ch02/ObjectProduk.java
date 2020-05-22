package ch02;

import java.util.Date;

public class ObjectProduk {
    public static void main(String[] args) {
        Produk x1 = new Produk();
        x1.barcode = "5452347253";
        x1.nama = "Cat";
        x1.tanggalkadaluarsa = new Date (2021-8-5);
        x1.harga = 7500;

        Produk x2 = new Produk();
        x2.barcode = "43573417534";
        x2.nama = "Nodrop";
        x2.tanggalkadaluarsa = new Date (2021-3-21);
        x2.harga = 15000;

        System.out.println(x1.nama + " (" + x1.barcode + ")");
        System.out.println("Harga: Rp" + x1.harga);
        System.out.println("Exp: " + x1.tanggalkadaluarsa.toString());

        System.out.println("==============================");

        System.out.println(x2.nama + " (" + x2.barcode + ")");
        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " + x2.tanggalkadaluarsa.toString());


    }


}
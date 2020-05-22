package ch02;

public class ObjectPegawai {
    public static void main(String[] args) {
        Pegawai pgw1 = new Pegawai();
        Pegawai pgw2 = new Pegawai();

        pgw1.nik = "123";
        pgw2.nama = "Dean";
        
        pgw1.jabatan = "Tukang";
        pgw1.isAktif = true;

        pgw2.nik = "123";
        pgw2.nama = "Marisha";
        pgw2.jabatan = "Administrator";
        pgw2.isAktif = true;

        pgw1.cetak();
        System.out.println("==============");
        pgw2.cetak();

    }

}
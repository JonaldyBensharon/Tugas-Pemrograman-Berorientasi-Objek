package edu.university.model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
        System.out.println("Program Penampilan Data Mahasiswa");

        Mahasiswa Adi = new Mahasiswa();
        daftarMahasiswa.add(Adi);

        Mahasiswa Budi = new Mahasiswa("Budiman Arianto", "2414051", 3.14);
        daftarMahasiswa.add(Budi);

        Mahasiswa Chika = new Mahasiswa();
        daftarMahasiswa.add(Chika);

        Mahasiswa Doni = new Mahasiswa("Doni Kartono", "2414053", 2.32);
        daftarMahasiswa.add(Doni);


        System.out.println("\nTampilan data mahasiswa sebelum pengisian data untuk objek mahasiswa yang dibuat melalui konstruktor tanpa parameter.");
        for(int i = 0; i < daftarMahasiswa.size(); i++) {
            daftarMahasiswa.get(i).getKategoriIPK();
        }

        Adi.setNama("Adiguna Herianto");
        Adi.setNim("2414050");
        Adi.setIpk(3.88);

        Chika.setNama("Chika Sulastri");
        Chika.setNim("2414052");
        Chika.setIpk(2.69);

        System.out.println("\nTampilan data mahasiswa setelah pengisian data untuk objek mahasiswa yang dibuat melalui konstruktor tanpa parameter.");
        for(int i = 0; i < daftarMahasiswa.size(); i++) {
            daftarMahasiswa.get(i).getKategoriIPK();
        }
    }
}

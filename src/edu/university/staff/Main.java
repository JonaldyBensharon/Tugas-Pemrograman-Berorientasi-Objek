package edu.university.staff;

import edu.university.model.Mahasiswa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        System.out.println("\nProgram Penampilan Data Gaji Pegawai\n\nGaji Pokok Pegawai sama terlepas dari posisinya, yaitu Rp5.000.000.");

        Dosen Andi = new Dosen("Andi Subejo", 48);
        daftarPegawai.add(Andi);

        Dosen Bonita = new Dosen("Bonita Mariyanti", 36);
        daftarPegawai.add(Bonita);

        StaffAdministrasi Cici = new StaffAdministrasi("Cici Wulandari", 24);
        daftarPegawai.add(Cici);

        StaffAdministrasi Dito = new StaffAdministrasi("Dito Pujakusuma", 21);
        daftarPegawai.add(Dito);

        System.out.println("Data Pegawai beserta Gajinya\n");
        for(int i = 0; i < daftarPegawai.size(); i++) {
            daftarPegawai.get(i).tampilkanInfo();
        }
    }
}

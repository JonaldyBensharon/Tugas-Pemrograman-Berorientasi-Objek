package edu.transport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<Kendaraan>();

        System.out.println("\nProgram Perhitungan Waktu Tempuh Kendaraan dengan Jarak 120 km\n");

        Mobil Avanza = new Mobil("Avanza 1.5", 180, 120);
        daftarKendaraan.add(Avanza);

        Mobil Fortuner = new Mobil("Fortuner", 200, 120);
        daftarKendaraan.add(Fortuner);

        SepedaMotor Supra = new SepedaMotor("Supra X 125", 120, 120);
        daftarKendaraan.add(Supra);

        SepedaMotor Scoopy = new SepedaMotor("Scoopy", 95, 120);
        daftarKendaraan.add(Scoopy);

        System.out.println("Hasil perhitungan waktu tempuh:\n");
        for(int i = 0; i < daftarKendaraan.size(); i++) {
            daftarKendaraan.get(i).tampilkanInfo();
        }


    }
}

package edu.transport;

public class Mobil extends Kendaraan {
    public Mobil(String nama, double kecepatanMaks, double jarak) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jarak = jarak;
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        return jarak / (0.8 * this.kecepatanMaks);
    }

    @Override
    public String getJenis() {
        return "Mobil";
    }
}

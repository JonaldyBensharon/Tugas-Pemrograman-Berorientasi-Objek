package edu.transport;

public class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama, double kecepatanMaks, double jarak) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jarak = jarak;
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        return jarak / (0.9 * this.kecepatanMaks);
    }

    @Override
    public String getJenis() {
        return "Sepeda Motor";
    }
}

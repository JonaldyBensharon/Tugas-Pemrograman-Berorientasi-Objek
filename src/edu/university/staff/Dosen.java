package edu.university.staff;

public class Dosen extends Pegawai {
    private int jumlahSKS;

    public Dosen(String nama, int jumlahSKS) {
        this.nama = nama;
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int hitungGaji() {
        return this.gajiPokok + this.jumlahSKS * 150000;
    }

    @Override
    public String getPosisi() {
        return "Dosen";
    }
}

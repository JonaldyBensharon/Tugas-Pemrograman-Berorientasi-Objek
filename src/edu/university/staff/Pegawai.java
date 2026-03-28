package edu.university.staff;

public class Pegawai {
    protected String nama;
    protected final int gajiPokok = 5000000;

    public int hitungGaji() {
        return this.gajiPokok;
    }

    public String getPosisi() {
        return "Pegawai";
    }

    public void tampilkanInfo() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("Posisi   : " + this.getPosisi());
        System.out.println("Gaji     : Rp" + this.hitungGaji() + "\n");
    }
}

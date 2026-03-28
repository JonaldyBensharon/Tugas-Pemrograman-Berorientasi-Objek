package edu.university.staff;

public class StaffAdministrasi extends Pegawai {
    private int jamLembur;

    public StaffAdministrasi(String nama, int jamLembur) {
        this.nama = nama;
        this.jamLembur = jamLembur;
    }

    @Override
    public int hitungGaji() {
        return this.gajiPokok + this.jamLembur * 50000;
    }

    @Override
    public String getPosisi() {
        return "Staff Administrasi";
    }
}

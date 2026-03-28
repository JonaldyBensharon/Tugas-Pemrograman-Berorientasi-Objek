package edu.university.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.ipk = 0;
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }


    public void getKategoriIPK() {
        if(this.getIpk() < 2.5) {
            System.out.println("Nama     : " + this.getNama());
            System.out.println("NIM      : " + this.getNim());
            System.out.println("IPK      : " + this.getIpk());
            System.out.println("Kategori : Perlu Perbaikan\n");

        } else if(this.getIpk() >= 2.5 && this.getIpk() < 3) {
            System.out.println("Nama     : " + this.getNama());
            System.out.println("NIM      : " + this.getNim());
            System.out.println("IPK      : " + this.getIpk());
            System.out.println("Kategori : Memuaskan\n");

        } else if(this.getIpk() >= 3 && this.getIpk() < 3.5) {
            System.out.println("Nama     : " + this.getNama());
            System.out.println("NIM      : " + this.getNim());
            System.out.println("IPK      : " + this.getIpk());
            System.out.println("Kategori : Sangat Memuaskan\n");

        } else {
            System.out.println("Nama     : " + this.getNama());
            System.out.println("NIM      : " + this.getNim());
            System.out.println("IPK      : " + this.getIpk());
            System.out.println("Kategori : Cumlaude\n");
        }
    }
}

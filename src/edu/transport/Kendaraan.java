package edu.transport;

abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;
    protected double jarak;

    abstract double hitungWaktuTempuh(double jarak);
    abstract String getJenis();

    public void tampilkanInfo() {
        System.out.println("Nama kendaraan     : " + this.nama);
        System.out.println("Jenis kendaraan    : " + this.getJenis());
        System.out.println("Kecepatan maksimum : " + this.kecepatanMaks + " km/jam");
        System.out.println("Jarak tempuh       : " + this.jarak + " km");

        double waktuTotal = this.hitungWaktuTempuh(this.jarak);
        System.out.printf("Waktu tempuh       : %.2f jam\n\n", waktuTotal);
    }

}

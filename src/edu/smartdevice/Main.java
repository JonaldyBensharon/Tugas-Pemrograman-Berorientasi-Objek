package edu.smartdevice;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nProgram Manajemen Smartwatch\n");

        System.out.println("Satu objek smartwatch dibuat dengan kapasitas baterai awal, yaitu 20%.");
        SmartWatch xiaomi = new SmartWatch(20);

        System.out.println("Pengisian baterai dilakukan selama 60 menit.\n");
        xiaomi.chargeBattery(60);

        System.out.println("Data kapasitas baterai dan koneksi saat ini");
        xiaomi.tampilkanInfo();

        System.out.println("Smartwatch dihubungkan dengan WiFi USU Network");
        xiaomi.connectWifi("USU Network");

        System.out.println("Pengisian baterai kembali dilakukan selama 15 menit.");
        xiaomi.chargeBattery(15);

        System.out.println("\nData kapasitas baterai dan koneksi saat ini");
        xiaomi.tampilkanInfo();
    }
}

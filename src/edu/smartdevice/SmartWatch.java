package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable{
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    public SmartWatch(int batteryLevel) {
        if(batteryLevel > 100) {
            this.batteryLevel = 100;
        } else if (batteryLevel < 100 && batteryLevel >= 0) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 0;
        }
        this.connected = false;
        this.ssid = "";
    }

    public void tampilkanInfo() {
        System.out.println("Tingkat kepenuhan baterai: " + this.getBatteryLevel() + "%");
        if(isConnected()) {
            System.out.println("Smartwatch memiliki koneksi dengan WiFi: " + this.ssid + "\n");
        } else {
            System.out.println("Smartwatch tidak terhubung dengan koneksi WiFi mana pun.\n");
        }
    }

    @Override
    public void chargeBattery(int menit) {
        if(this.batteryLevel >= 100) {
            System.out.println("Baterai sudah terisi penuh, proses pengisian baterai dihentikan.");
            return;
        }
        this.batteryLevel += menit;
        if(this.batteryLevel > 100) {
            this.batteryLevel = 100;
        }
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void connectWifi(String ssid) {
        if(ssid.equals("")) {
            this.connected = false;
        } else {
            this.connected = true;
            this.ssid = ssid;
        }
    }

    public boolean isConnected() {
        return this.connected;
    }
}

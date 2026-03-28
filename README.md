# Tugas Pemrograman Berorientasi Objek

Program pada masing-masing package sudah melakukan pembuatan objek, tanpamenerima input dari pengguna.

## Package edu.university.model berisikan jawaban dari soal pertama
   Package tersebut berisikan kelas:
   - Mahasiswa, sebagai desain dasat atas atribut dan metode dari suatu objek Mahasiswa
   - Main, sebagai wadah eksekusi program
   
   Program ini bertujuan untuk menampilkan data mahasiswa beserta kategori nilai berdasarkan IPK yang diberikan pada saat pembuatan objek.

## Package edu.university.staff berisikan jawaban dari soal kedua
   Package tersebut berisikan kelas:
   - Pegawai, sebagai kelas induk (super class) yang menjadi desain dasar atas metode dan atribut dari suatu objek Pegawai
   - Dosen, sebagai kelas turunan yang memiliki jumlahSKS sebagai atribut khusus
   - StaffAdministrasi, sebagai kelas turunan yang memiliki jamLembur sebagai atribut khusus
   - Main, sebagai wadah eksekusi program
   
   Program ini bertujuan untuk menghitung gaji sekumpulan Pegawai, baik Dosen maupun StaffAdministrasi, dan menampilkan datanya.

## Package edu.transport berisikan jawaban dari soal ketiga
   Package tersebut berisikan kelas:
   - Kendaraan, sebagai kelas abstrak (abstract class) yang memiliki metode abstrak, yaitu hitungWaktuTempuh
   - Mobil, sebagai kelas turunan
   - SepedaMotor, sebagai kelas turunan
   - Main, sebagai wadah eksekusi program
   
   Program ini bertujuan untuk menghitung waktu tempuh dari sekumpulan objek kendaraan, baik Mobil maupun SepedaMotor, untuk jarak 120 km dan menampilkan datanya.

## Package edu.smartwatch berisikan jawaban dari soal keempat
   Package tersebut berisikan:
   - Interface Rechargable, berisikan metode chargeBattery dan getBatteryLevel
   - Interface Connectable, berisikan metode connectWifi dan isConnected
   - Kelas SmartWatch, yang mengimplementasikan metode dari interface Rechargable dan Connectable
   - Kelas Main, sebagai wadah eksekusi program
   
   Program ini bertujuan untuk menunjukkan pengoperasian dari suatu objek SmartWatch, mulai dari pembuatannya, pengisian daya, serta pengkoneksian dengan WiFi, lalu menampilkan informasinya.

## Package edu.ecommerce berisikan jawaban dari soal kelima
   Package tersebut berisikan kelas:
   - Order, yang menjadi desain dasar atas atribut serta metode perhitungan total pembayaran dan penampilan rincian pesanan dari suatu objek Order
   - OrderItem, sebagai inner class yang menjadi desain dasar atas atribut dan metode dari setiap item dalam suatu pesanan.
   - Main, sebagai wadah eksekusi program
   
   Program ini bertujuan untuk menampilkan informasi dari suatu pesanan yang terdiri atas sekumpulan item, beserta subtotal untuk setiap item dan total pembayarannya.

package sesi8C;

import sesi8B.Jurusan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika);
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "87654321", 22, jurusanInformatika);

        // Membuat objek Kelas
        Kelas kelasPemrograman = new Kelas("Pemrograman Java", "PJ101");
        Kelas kelasBasisData = new Kelas("Basis Data", "BD102");

        // Menambahkan Mahasiswa ke dalam Kelas
        kelasPemrograman.addMahasiswa(mahasiswa1);
        kelasPemrograman.addMahasiswa(mahasiswa2);
        kelasBasisData.addMahasiswa(mahasiswa1);

        // Menampilkan data Kelas dan Mahasiswa
        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        System.out.println("\nInformasi Kelas:");
        kelasPemrograman.displayInfo();
        kelasBasisData.displayInfo();
    }
}

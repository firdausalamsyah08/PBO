package sesi8C;

import java.util.ArrayList;
import java.util.List;
import sesi8B.Jurusan;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan jurusan;
    private List<Kelas> kelasList;

    // Constructor
    public Mahasiswa(String nama, String nim, int usia, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
        this.kelasList = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Kelas> getKelasList() {
        return kelasList;
    }

    // Metode untuk menambahkan Kelas ke dalam daftar Mahasiswa
    public void addKelas(Kelas kelas) {
        if (!kelasList.contains(kelas)) {
            kelasList.add(kelas);
            kelas.addMahasiswa(this); // Menghindari duplikasi
        }
    }

    // Metode untuk menampilkan info Mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        if (jurusan != null) {
            System.out.println("Jurusan: " + jurusan.getNama());
        }
        System.out.println("Kelas yang diikuti:");
        for (Kelas kelas : kelasList) {
            System.out.println("- " + kelas.getNamaKelas());
        }
    }
}


package sesi8D;

import java.util.ArrayList; 
import java.util.List; 
 
public class MataKuliah { 
    private String nama; 
    private String kode; 
    private List<Mahasiswa> mahasiswaList; 
 
    public MataKuliah(String nama, String kode) { 
        this.nama = nama; 
        this.kode = kode; 
        this.mahasiswaList = new ArrayList<>(); 
    } 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getKode() { 
        return kode; 
    } 

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }
 
    public void addMahasiswa(Mahasiswa mahasiswa) { 
        if (!mahasiswaList.contains(mahasiswa)) { 
            mahasiswaList.add(mahasiswa); 
            if (!mahasiswa.getMataKuliahList().contains(this)) {
                mahasiswa.addMataKuliah(this); // Menjaga relasi dua arah
            }
        } 
    } 
 
    public void displayInfo() { 
        System.out.println("Mata Kuliah: " + nama); 
        System.out.println("Kode: " + kode); 
        System.out.println("Daftar Mahasiswa:"); 
        for (Mahasiswa mhs : mahasiswaList) { 
            System.out.println("- " + mhs.getNama()); 
        } 
    } 
}

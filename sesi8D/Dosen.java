package sesi8D;

import java.util.ArrayList; 
import java.util.List; 
 
public class Dosen { 
    private String nama; 
    private String nip; 
    private List<Mahasiswa> mahasiswaWaliList; 
 
    public Dosen(String nama, String nip) { 
        this.nama = nama; 
        this.nip = nip; 
        this.mahasiswaWaliList = new ArrayList<>(); 
    } 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getNip() { 
        return nip; 
    } 

    public List<Mahasiswa> getMahasiswaWaliList() { 
        return mahasiswaWaliList; 
    } 
 
    public void tambahMahasiswa(Mahasiswa mahasiswa) { 
        if (!mahasiswaWaliList.contains(mahasiswa)) { 
            mahasiswaWaliList.add(mahasiswa); 
            if (mahasiswa.getDosenWali() != this) {
                mahasiswa.setDosenWali(this); // Mengatur relasi dua arah
            }
        } 
    } 
 
    public void displayInfo() { 
        System.out.println("Nama Dosen: " + nama); 
        System.out.println("NIP: " + nip); 
        System.out.println("Mahasiswa Bimbingan:"); 
        for (Mahasiswa mhs : mahasiswaWaliList) { 
            System.out.println("- " + mhs.getNama()); 
        } 
    } 
} 

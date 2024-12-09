package sesi7;

public class Siswa {
    private String nama;
    private int nilaiUjian;

    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilaiUjian() {
        return nilaiUjian;
    }

    public void setNilaiUjian(int nilaiUjian) {
        if (nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Nilai Ujian: " + nilaiUjian);
    }
}

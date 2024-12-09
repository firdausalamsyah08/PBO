package sesi7;

public class Mahasiswa {
    public String nama;
    protected int usia;
    private String jurusan;

    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
    }
}

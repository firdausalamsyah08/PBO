package sesi7;

public class Main {
    public static void main(String[] args) {
        // Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", 20, "Teknik Informatika");
        mahasiswa1.tampilkanInfo();
        System.out.println();

        // Mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);
        mobil1.tampilkanInfoMobil();
        System.out.println();

        // Siswa
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();
        System.out.println();

        // Nilai
        Nilai nilai1 = new Nilai();
        nilai1.setQuis(60);
        nilai1.setUTS(80);
        nilai1.setUAS(75);

        System.out.println("Quis    : " + nilai1.getQuis());
        System.out.println("UTS     : " + nilai1.getUTS());
        System.out.println("UAS     : " + nilai1.getUAS());
        System.out.println("NA      : " + nilai1.getNA());
        System.out.println("Index   : " + nilai1.getIndex());
        System.out.println("Keterangan : " + nilai1.getKeterangan());
        System.out.println();

        // Waktu
        Waktu waktu1 = new Waktu();
        waktu1.setJam(2);
        waktu1.setMenit(30);
        waktu1.tampilWaktu();
        waktu1.tambahMenit(90);
        waktu1.tampilWaktu();
    }
}

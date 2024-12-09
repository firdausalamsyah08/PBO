package sesi8;

public class Main {
    public static void main(String[] args) {
        // Membuat objek alat tulis
        AlatTulis bolpoint = new AlatTulis();
        AlatTulis pensil = new AlatTulis();
        AlatTulis penghapus = new AlatTulis();

        // Mengatur data untuk masing-masing alat tulis
        bolpoint.setData("Bolpoint", 10, 2000);
        pensil.setData("Pensil", 10, 1000);
        penghapus.setData("Penghapus", 10, 500);

        // Menampilkan data masing-masing alat tulis
        bolpoint.getData();
        pensil.getData();
        penghapus.getData();

        // Menghitung total harga seluruh alat tulis
        int totalHargaAlatTulis = bolpoint.getTotalHarga() + pensil.getTotalHarga() + penghapus.getTotalHarga();
        System.out.println("Total Harga Alat Tulis: " + totalHargaAlatTulis);
        System.out.println();

        // Membuat objek menu restoran
        MenuRestoran nasiGoreng = new MenuRestoran();
        MenuRestoran mieGoreng = new MenuRestoran();
        MenuRestoran esTeh = new MenuRestoran();

        // Mengatur data untuk masing-masing menu restoran
        nasiGoreng.setData("Nasi Goreng", 2, 15000);
        mieGoreng.setData("Mie Goreng", 1, 12000);
        esTeh.setData("Es Teh", 3, 5000);

        // Menampilkan data masing-masing menu restoran
        nasiGoreng.getData();
        mieGoreng.getData();
        esTeh.getData();

        // Menghitung total harga seluruh menu restoran
        int totalHargaMenuRestoran = nasiGoreng.getTotalHarga() + mieGoreng.getTotalHarga() + esTeh.getTotalHarga();
        System.out.println("Total Harga Menu Restoran: " + totalHargaMenuRestoran);
        System.out.println();

        // Total keseluruhan (alat tulis + restoran)
        int totalKeseluruhan = totalHargaAlatTulis + totalHargaMenuRestoran;
        System.out.println("Total Keseluruhan (Alat Tulis + Restoran): " + totalKeseluruhan);
    }
}
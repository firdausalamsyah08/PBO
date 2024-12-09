package sesi8;

class MenuRestoran {
    private String nama;
    private int jumlah;
    private int hargaSatuan;
    private int totalHarga;

    // Method untuk memasukkan data menu restoran
    public void setData(String nama, int jumlah, int hargaSatuan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = jumlah * hargaSatuan;
    }

    // Method untuk menampilkan data menu restoran
    public void getData() {
        System.out.println("Nama Menu: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Harga " + nama + ": " + totalHarga);
        System.out.println();
    }

    // Method untuk menghitung total harga menu
    public int getTotalHarga() {
        return totalHarga;
    }
}
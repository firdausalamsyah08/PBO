package sesi8; 
class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int totalHarga;

    // Method untuk memasukkan data alat tulis
    public void setData(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = stok * hargaSatuan;
    }

    // Method untuk menampilkan data alat tulis
    public void getData() {
        System.out.println("Nama Alat Tulis: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Harga " + nama + ": " + totalHarga);
        System.out.println();
    }

    // Method untuk menghitung total harga alat tulis
    public int getTotalHarga() {
        return totalHarga;
    }
}